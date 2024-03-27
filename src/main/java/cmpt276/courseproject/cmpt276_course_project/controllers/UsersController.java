package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cmpt276.courseproject.cmpt276_course_project.models.UserRepository;
import cmpt276.courseproject.cmpt276_course_project.backEnd.Course;
import cmpt276.courseproject.cmpt276_course_project.backEnd.CourseCreator;
import cmpt276.courseproject.cmpt276_course_project.models.User;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UsersController {

    @Autowired
    private UserRepository usersRepository;


    // ADMIN - page goes to admin Page to see full list of users
    @GetMapping("/users/view")
    public String getAllUsers(HttpSession session, Model model) {
        // test in correct user 
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (!user.isAdmin()) return "redirect:/";

        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users/adminPage";
    }

    // USER - page goes to courses page with list of courses sorted between finished and unfinished
    @GetMapping("/users/courses")
    public String getAllCourses(HttpSession session, Model model) {
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling 
        if (user == null) return "redirect:/";

        // seperate finished and not finished
        List<String> finished = user.getFinished(); 
        List<String> sosyList = CourseCreator.generateSOSYCourses(); 
        List<String> toFinish = new ArrayList<>();

        // test that finished is always constructed properly by user 
        if (finished != null) {
            for (String course : sosyList) {
                if (!(finished.contains(course))) {
                    toFinish.add(course);
                }
            }
        }   
        List<Course> showCourses = new ArrayList<>();
        if (finished != null) {
            for (String course : finished) {
                showCourses.add(new Course(course, true)); 
            }
        }       
        for (String course : toFinish) {
            showCourses.add(new Course(course, false)); 
        }
        // test
        assert (showCourses.size() == sosyList.size()); 
        
        // using string comparator 
        showCourses.sort(new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        model.addAttribute("showCourses", showCourses); 
        return "users/courses";
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
        return "redirect:/users/courses";
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
        return "redirect:/users/courses";
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
            return "redirect:/users/view";
        }
        // landing page for student user
        return "redirect:/users/courses";
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
