package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cmpt276.courseproject.cmpt276_course_project.models.UserRepository;
import cmpt276.courseproject.cmpt276_course_project.courses.Course;
import cmpt276.courseproject.cmpt276_course_project.courses.CourseOffering;
import cmpt276.courseproject.cmpt276_course_project.courses.CourseCreator;
import cmpt276.courseproject.cmpt276_course_project.models.User;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UsersController {

    @Autowired
    private UserRepository usersRepository;

    // EDIT - Only for debugging, access to db info
    @GetMapping("/users/view")
    public String getAllUsers(Model model) {
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users/adminPage";
    }

    // Need to link to a specific account. 
    @GetMapping("/users/coursesEnd")
    public String getSCourse(Model model) {
        List<String> coursesString = CourseCreator.generateSosyList();
        List<Course> courses = new ArrayList<>(); 
        for (String string : coursesString) {
            Course newCourse = Course.fromString(string); 
            newCourse.createStringRepresentation();
            courses.add(newCourse); 
        }
        model.addAttribute("courses", courses);
        return "users/courses";
    }
    @GetMapping("/users/courseOfferingsEnd")
    public String getCourseOfferings (@RequestParam Map<String, String> input, HttpServletResponse response, Model model){
        String inputCourse = input.get("chosenCourse");
        Course chosenCourse = Course.fromString(inputCourse); 
        List<String> offeringStrings = chosenCourse.getCourseOfferings(); 
        List<CourseOffering> offerings = new ArrayList<>(); 
        for (String string : offeringStrings) {
            CourseOffering newOffering = CourseOffering.fromString(string); 
            newOffering.createStringRepresentation();
            newOffering.createLabelForChoice(); 
            offerings.add(newOffering); 
        }
        model.addAttribute("offerings", offerings);
        return "users/courseOfferings"; 
    } 

    @PostMapping("/users/register")
    public String addUser(@RequestParam String username, @RequestParam String password,
            RedirectAttributes redirectAttributes) {
        List<User> userlist = usersRepository.findByName(username);
        if (!userlist.isEmpty()) {
            return "redirect:/register.html?error=username+is+already+taken";
        }

        User user = new User(username, password, false);
        usersRepository.save(user);
        return "redirect:/login.html?success=User+registered+successfully";
    }

    @PostMapping("/users/login")
    public String login(@RequestParam String name, @RequestParam String password, HttpSession session) {
        List<User> userList = usersRepository.findByNameAndPassword(name, password);
        if (userList.isEmpty()) {
            // Handle the login failure case 
            return "redirect:/login.html?error=true";
        }

        User user = userList.get(0);
        session.setAttribute("session_user", user);

        // Redirecting to a generic welcome page, not specific to user roles for
        return "redirect:/welcome.html";
    }

    @GetMapping("/api/userinfo")
    @ResponseBody
    public String getUserInfo(HttpSession session) {
        User user = (User) session.getAttribute("session_user");
        if (user != null) {
            return "redirect:/welcome.html";
        } else {
            // Handle the case where there is no user in the session.
            return "redirect:/welcome.html";
        }
    }

    @GetMapping("/logout")
    @ResponseBody
    public Map<String, Object> destroySession(HttpSession session) {
        session.invalidate();
        return Collections.singletonMap("status", "logged_out");
    }

    @GetMapping("/login")
    public String login() {
        return "redirect:/login.html"; 
    }
}
