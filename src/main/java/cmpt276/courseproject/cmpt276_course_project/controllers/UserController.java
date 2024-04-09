package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cmpt276.courseproject.cmpt276_course_project.models.*;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // ADMIN - page removes user
    @GetMapping("/users/remove")
    public String getRemove(@RequestParam String userName) {
        List<User> userlist = userRepository.findByName(userName);

        // error handling
        if (userlist.isEmpty()) {
            return "redirect:/";
        }

        User userToRemove = userlist.get(0);
        if (!userToRemove.isAdmin()) {
            userRepository.delete(userToRemove);
        }
        return "redirect:/users/adminPage";
    }

    // USER - Sets up users own list of courses to display
    @PostMapping("/users/courses")
    public String getAllCourses(HttpSession session, Model model) {
        System.out.println("test");
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling
        if (user == null) return "redirect:/";
        System.out.println("getAllCourses");
        // match the template list to user data
        List<DisplayCourse> userList = SoSyCourses.generateSoSyCourses();

        model.addAttribute("user_courses", userList);
        return "redirect:/users/userPage";
    }

    // USER - method updates finished courses
    @GetMapping("/users/finishedCourse")
    public String finishedCourse (@RequestParam String courseName, HttpSession session) {
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling
        if (user == null) return "redirect:/";

        user.finishedCourse(courseName);
        userRepository.save(user);
        return "redirect:/users/userPage";
    }

    // USER - method updates unfinished courses
    @GetMapping("/users/unfinishedCourse")
    public String unfinishedCourse (@RequestParam String courseName, HttpSession session) {
        // test in correct user
        User user = (User) session.getAttribute("session_user");
        // error handling
        if (user == null) return "redirect:/";

        user.unfinishedCourse(courseName);
        userRepository.save(user);
        return "redirect:/users/userPage";
    }

    // USER or ADMIN - method registers new user
    @PostMapping("/users/register")
    public String addUser(@RequestParam String username, @RequestParam String password) {
        // test username
        List<User> userlist = userRepository.findByName(username);
        // error handling returned to the front end
        if (!userlist.isEmpty()) {
            return "redirect:/register.html?error=username+is+already+taken";
        }
        // test admin
        User user = new User(username, password, false);
        userRepository.save(user);
        return "redirect:/login.html?success=User+registered+successfully";
    }

    // USER or ADMIN - method logins user and redirects to the corresponding landing page
    @PostMapping("/users/login")
    public String login(@RequestParam String name, @RequestParam String password, HttpSession session) {
        // test username and password
        List<User> userList = userRepository.findByNameAndPassword(name, password);
        // error handling returned to the front end
        if (userList.isEmpty()) {
            // Handle the login failure case
            return "redirect:/login.html?error=true";
        }
        User user = userList.get(0);
        session.setAttribute("session_user", user);
        System.out.println("login");
        // landing page for admin
        if (user.isAdmin()) {
            session.setAttribute("all_users", userRepository.findAll());
            return "users/adminPage";
        }
        System.out.println("redirecting");
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

    // REDIRECT - home
    @GetMapping("/error")
    public String redirectHome() {
        return "redirect:/";
    }
}
