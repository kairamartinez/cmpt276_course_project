package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cmpt276.courseproject.cmpt276_course_project.models.*; 
import cmpt276.courseproject.cmpt276_course_project.courseList.*;
import cmpt276.courseproject.cmpt276_course_project.courseSchedule.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


// All mappings that process information are enclosed in try...catch block for error handling 

@Controller
public class UsersController {

    @Autowired
    private UserRepository usersRepository;

    // TEST - valid admin 
    private void testSessionAdmin (HttpSession session) throws RuntimeException {
        User user = (User) session.getAttribute("session_user");
        if (!user.isAdmin()) throw new IllegalStateException("Unauthorized User"); 
    }

    // TEST - valid user 
    private void testSessionUser (HttpSession session) throws RuntimeException {
        User user = (User) session.getAttribute("session_user");
        if (user == null) throw new IllegalStateException("Unauthorized User"); 
    }

    // REDIRECT - logout 
    @GetMapping("/users/logout")
    public String destroySession(HttpSession session) {
        // throws its own error but session should always be valid before
        session.invalidate();
        System.out.println("user invalidated"); 
        return "redirect:/"; 
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

    // ADMIN - page generated with full list of users
    @GetMapping("/users/admin")
    public String getAllUsers(HttpSession session, Model model) {
        try {
            // test user 
            testSessionAdmin(session); 

            // find information from database
            List<User> users = usersRepository.findAll();
            model.addAttribute("users", users);

            // return page 
            return "users/adminPage";  

        // error handling     
        } catch (Exception error) {
            return "redirect:/";  
        } 
    }

    // ADMIN - method removes user 
    @GetMapping("/users/remove")
    public String getRemove(@RequestParam String userName, HttpSession session) {
        try {
            // test user 
            testSessionAdmin(session); 
            List<User> userlist = usersRepository.findByName(userName);
            if (userlist.isEmpty()) throw new RuntimeException("Error in parsing Database"); 

            // update information to database
            User toRemove = userlist.get(0);
            if (toRemove.isAdmin()) throw new RuntimeException("Cannot remove Admin"); 
            usersRepository.delete(userlist.get(0));

            // return page 
            return "redirect:/users/admin";
        
        // error handling 
        } catch (IllegalStateException unauthorized) {
            return "redirect:/"; 
        } catch (Exception error) {
            return "redirect:/users/admin"; 
        }       
    }

    // USER - page generated with list of courses finished and unfinished
    @GetMapping("/users/listCourses")
    public String getAllCourses(HttpSession session, Model model) {
        try {
            // test user 
            testSessionUser(session);
            User user = (User) session.getAttribute("session_user");

            // find information from database
            List<String> finished = user.getFinished(); 
            if (finished == null) throw new RuntimeException("List incorrectly constructed"); 
            
            // find information from sosy lists
            List<String> toFinish = ListSOSY.generateSOSYCourses(); 
            toFinish.removeAll(finished); 

            // merge and sort information 
            List<ListCourse> courses = new ArrayList<>();
            for (String course : finished) courses.add(new ListCourse(course, true)); 
            for (String course : toFinish) courses.add(new ListCourse(course, false)); 
            courses.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
            
            // return page 
            model.addAttribute("courses",  courses); 
            return "users/listCourses";

        // error handling     
        } catch (Exception error) {
            return "redirect:/";  
        }        
    }

    // USER - method updates finished courses 
    @GetMapping("/users/finishCourse") 
    public String finishClass (@RequestParam String courseName, HttpSession session) {
        try {
            // test uesr 
            testSessionUser(session);
            User user = (User) session.getAttribute("session_user");

            // update information to databases 
            user.addFinished(courseName); 
            usersRepository.save(user);

            // return page
            return "redirect:/users/listCourses";
        
        // error handling
        } catch (IllegalStateException unauthorized) {
            return "redirect:/";  
        } catch (Exception error) {
            return "redirect:/users/listCourses";
        }
    }

    // USER - method updates unfinished courses 
    @GetMapping("/users/unfinishCourse") 
    public String unfinishClass (@RequestParam String courseName, HttpSession session) {
        try {
            // test uesr 
            testSessionUser(session);
            User user = (User) session.getAttribute("session_user");

            // update information to databases 
            user.removeFinished(courseName); 
            usersRepository.save(user);

            // return page
            return "redirect:/users/listCourses";

        // error handling
        } catch (IllegalStateException unauthorized) {
            return "redirect:/";  
        } catch (Exception error) {
            return "redirect:/users/listCourses";
        }
    }

    // USER - get sosy courses currently scheduled 
    @GetMapping("/users/scheduled")
    public String getScheduledCourses (HttpSession session, Model model) {
        try {
            // test user 
            testSessionUser(session);

            // get information from sosy list 
            List<ScheduledCourse> courses = ScheduledSOSY.getAllScheduledCourses();
            for (ScheduledCourse course : courses) {
                course.setLectureString();;
                course.setInfoString(); 
            }

            // return page 
            model.addAttribute("courses", courses);
            return "users/scheduledCourses";
        
        // error handling     
        } catch (IllegalStateException unauthorized) {
            return "redirect:/";  
        } catch (Exception error) {
            return "redirect:/users/listCourses";
        }
    }

    // USER - get chosen scheduled courses 
    @GetMapping("/users/chosen")
    public String getChosenSchedule (@RequestParam Map<String, String> chosen, HttpSession session, Model model) {
        try {
            // test user 
            testSessionUser(session);

            // get information from front-end 
            List<String> chosenValues = List.copyOf(chosen.values()); 
            List<String> chosenCourseNumbers = chosenValues.subList(0, chosenValues.size()-1); 

            // get information from back-end 
            List<List<String>> weekSchedule = ScheduleCreator.generateSchedule(chosenCourseNumbers); 
            List<String> mondaySchedule = weekSchedule.get(0);
            List<String> tuesdaySchedule = weekSchedule.get(1);
            List<String> wednesdaySchedule = weekSchedule.get(2);
            List<String> thursdaySchedule = weekSchedule.get(3);
            List<String> fridaySchedule = weekSchedule.get(4);  

            // return page 
            model.addAttribute("mondaySchedule", mondaySchedule);
            model.addAttribute("tuesdaySchedule", tuesdaySchedule);
            model.addAttribute("wednesdaySchedule", wednesdaySchedule);
            model.addAttribute("thursdaySchedule", thursdaySchedule);
            model.addAttribute("fridaySchedule", fridaySchedule);
            return "users/chosenCourses";

        } catch (IllegalStateException unauthorized) {
            return "redirect:/";      
        } catch (Exception error) {
            return "redirect:/users/scheduled"; 
        }
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
}
