package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cmpt276.courseproject.cmpt276_course_project.models.UserRepository;
import cmpt276.courseproject.cmpt276_course_project.courseList.*;
import cmpt276.courseproject.cmpt276_course_project.courseSchedule.*;
import cmpt276.courseproject.cmpt276_course_project.models.User;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UsersController {

    @Autowired
    private UserRepository usersRepository;


    // ADMIN - page goes to admin Page to see full list of users
    @GetMapping("/users/admin")
    public String getAllUsers(HttpSession session, Model model) {
        // test in correct user 
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (!user.isAdmin()) return "redirect:/";

        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users/adminPage";
    }

    // ADMIN - page removes user 
    @GetMapping("/users/remove")
    public String getRemove(@RequestParam String userName, HttpSession session) {
        // test in correct user 
        User user = (User) session.getAttribute("session_user");
        // error handling 
        
        if (!user.isAdmin()) return "redirect:/";

        // test not empty 
        List<User> userlist = usersRepository.findByName(userName);
        assert(!userlist.isEmpty()); 

        // handle if user admin 
        User toRemove = userlist.get(0);
        if (toRemove.isAdmin()) {
            return "redirect:/users/admin";
        }

        // update 
        usersRepository.delete(userlist.get(0)); 
        return "redirect:/users/admin";
    }

    // USER - page goes to courses page with list of courses sorted between finished and unfinished
    @GetMapping("/users/listCourses")
    public String getAllCourses(HttpSession session, Model model) {
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (user == null) return "redirect:/";

        // seperate finished and not finished
        List<String> finished = user.getFinished(); 
        List<String> sosyList = ListSOSY.generateSOSYCourses(); 
        List<String> toFinish = new ArrayList<>();

        // test that finished is always constructed properly by user 
        if (finished != null) {
            for (String course : sosyList) {
                if (!(finished.contains(course))) {
                    toFinish.add(course);
                }
            }
        }   
        List<ListCourse> courses = new ArrayList<>();
        if (finished != null) {
            for (String course : finished) {
                courses.add(new ListCourse(course, true)); 
            }
        }       
        for (String course : toFinish) {
            courses.add(new ListCourse(course, false)); 
        }
        // test
        assert (courses.size() == sosyList.size()); 
        
        // using string comparator 
        courses.sort(new Comparator<ListCourse>() {
            @Override
            public int compare(ListCourse o1, ListCourse o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        model.addAttribute("courses",  courses); 
        return "users/listCourses";
    }

    // USER - method updates finished courses 
    @GetMapping("/users/finishCourse") 
    public String finishClass (@RequestParam String courseName, HttpSession session) {
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (user == null) return "redirect:/";

        user.addFinished(courseName); 
        usersRepository.save(user);
        return "redirect:/users/listCourses";
    }

    // USER - method updates unfinished courses 
    @GetMapping("/users/unfinishCourse") 
    public String unfinishClass (@RequestParam String courseName, HttpSession session) {
        // test in correct user 
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (user == null) return "redirect:/";

        user.removeFinished(courseName); 
        usersRepository.save(user);
        return "redirect:/users/listCourses";
    }

    // USER - get sosy courses currently scheduled 
    @GetMapping("/users/scheduled")
    public String getScheduledCourses (HttpSession session, Model model) {
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (user == null) return "redirect:/";

        // generate all current courses
        List<ScheduledCourse> courses = ScheduledSOSY.getAllScheduledCourses();
        for (ScheduledCourse course : courses) {
            course.setLectureString();;
            course.setInfoString(); 
        }
        model.addAttribute("courses", courses);
        return "users/scheduledCourses";
    }

    // USER - get chosen scheudled courses 
    @GetMapping("/users/chosen")
    public String getChosenSchedule (@RequestParam Map<String, String> chosen, HttpSession session, Model model) {
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (user == null) return "redirect:/";

        // get selected list of course numbers 
        List<String> chosenValues = List.copyOf(chosen.values()); 
        List<String> chosenCourseNumbers = chosenValues.subList(0, chosenValues.size()-1); 

        // create schedule 
        List<List<String>> weekSchedule = ScheduleCreator.generateSchedule(chosenCourseNumbers); 

        // create week schedule
        List<String> mondaySchedule = weekSchedule.get(0);
        model.addAttribute("mondaySchedule", mondaySchedule);
        List<String> tuesdaySchedule = weekSchedule.get(1);
        model.addAttribute("tuesdaySchedule", tuesdaySchedule);
        List<String> wednesdaySchedule = weekSchedule.get(2); 
        model.addAttribute("wednesdaySchedule", wednesdaySchedule);
        List<String> thursdaySchedule = weekSchedule.get(3); 
        model.addAttribute("thursdaySchedule", thursdaySchedule);
        List<String> fridaySchedule = weekSchedule.get(4); 
        model.addAttribute("fridaySchedule", fridaySchedule);

        return "users/chosenCourses";
    }


    // USER or ADMIN - method registers new user 
    @PostMapping("/users/register")
    public String addUser(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // test username
        List<User> userlist = usersRepository.findByName(username);
        // error handling returned to front end 
        if (!userlist.isEmpty()) {
            return "redirect:/register.html?error=username+is+already+taken";
        }
        // test admin 
        User user = new User(username, password, false);
        if (user.getName().equals("adminHere@sfu.ca"))  {
            user.setAdmin(true); 
        }
        usersRepository.save(user);
        return "redirect:/login.html?success=User+registered+successfully";
    }

    // USER or ADMIN - method logins user and redirects to corresponding landing page 
    @PostMapping("/users/login")
    public String login(@RequestParam String name, @RequestParam String password, HttpSession session) {
        // test username and password 
        List<User> userList = usersRepository.findByNameAndPassword(name, password);
        // error handling returned to front end 
        if (userList.isEmpty()) {
            // Handle the login failure case 
            return "redirect:/login.html?error=true";
        }

        User user = userList.get(0);
        session.setAttribute("session_user", user);

        // landing page for admin 
        if (user.isAdmin())  {
            return "redirect:/users/admin";
        }
        // landing page for student user
        return "redirect:/users/listCourses";
    }

    // REDIRECT - logout 
    @GetMapping("/logout")
    @ResponseBody
    public Map<String, Object> destroySession(HttpSession session) {
        // throws its own error but session should always be valid before
        session.invalidate();
        return Collections.singletonMap("status", "logged_out");
    }

    // REDIRECT - login 
    @GetMapping("/login")
    public String login() {
        return "redirect:/login.html"; 
    }
    
    // REDIRECT - home
    @GetMapping("/error")
    public String redirectHome() {
        return "redirect:/"; 
    }
}
