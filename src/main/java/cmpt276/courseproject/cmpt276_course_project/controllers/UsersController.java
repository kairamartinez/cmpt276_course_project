package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cmpt276.courseproject.cmpt276_course_project.models.UserRepository;
import cmpt276.courseproject.cmpt276_course_project.models.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {

    @Autowired
    private UserRepository usersRepository;

    public UsersController() {
    }

    @GetMapping("/users/view")
    public String getAllUsers(Model model) {
        System.out.println("Hello from all users");
        List<User> users = usersRepository.findAll(); // db
        model.addAttribute("users", users);
        return "users/adminPage";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam Map<String, String> newUser, HttpServletResponse response) {
        System.out.println("adding user.");
        String newName = newUser.get("newName");
        String newPassword = newUser.get("newPassword");
        List<User> userlist = usersRepository.findByName(newName);
        
        if (userlist.isEmpty()) {
            // default is not admin, to add new admin use database terminal
            usersRepository.save(new User(newName, newPassword, false));
            response.setStatus(201);
            return "users/Schedule";
        } else {
            return "users/planner";
        }
    }

    @GetMapping("/login")
    public String getLogin(Model model, HttpServletRequest request, HttpSession session) {
        User user = (User) session.getAttribute("session_user");
        if (user == null) {
            return "users/planner";
        } else {
            model.addAttribute("user", user);
            if (user.isAdmin()) {
                List<User> users = usersRepository.findAll(); // db
                model.addAttribute("users", users);
                return "users/adminPage";
            } else {
                return "users/Schedule";
            }
        }
    }

    @PostMapping("/users/login")
    public String login(@RequestParam Map<String, String> formData, Model model, HttpServletRequest request,
            HttpSession session) {
        // processing login
        String name = formData.get("name");
        String pwd = formData.get("password");
        List<User> userlist = usersRepository.findByNameAndPassword(name, pwd);
        if (userlist.isEmpty()) {
            return "users/planner";
        } else {
            // success
            User user = userlist.get(0);
            request.getSession().setAttribute("session_user", user);
            model.addAttribute("user", user);
            if (user.isAdmin()) {
                List<User> users = usersRepository.findAll(); // db
                model.addAttribute("users", users);
                return "users/adminPage";
            } else {
                return "users/Schedule";
            }
        }
    }

    @GetMapping("/logout")
    public String destroySession(HttpServletRequest request) {
        request.getSession().invalidate();
        return "users/planner";
    }
}
