package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cmpt276.courseproject.cmpt276_course_project.models.UserRepository;
import cmpt276.courseproject.cmpt276_course_project.models.User;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {

    @Autowired
    private UserRepository usersRepository;

    // Only for debugging, delete this when dont so there is no outside access to db
    // info
    @GetMapping("/users/view")
    public String getAllUsers(Model model) {
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users/adminPage";
    }

    @PostMapping("/users/register")
    public String addUser(@RequestParam String username, @RequestParam String password, Model model) {
        List<User> userlist = usersRepository.findByName(username);
        if (!userlist.isEmpty()) {
            System.out.println("<script>alert('Username taken.')</script>");
            return "redirect:/register.html";
        } else if (username.endsWith("@sfu.ca")) {
            // user inputed an additional @sfu.ca
            username = username.substring(0, username.length() - "@sfu.ca".length());
        }

        User user = new User(username, password, false);
        usersRepository.save(user);
        model.addAttribute("user", user);
        return "users/userSchedule";
    }

    @PostMapping("/users/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model,
            HttpSession session) {
        List<User> userList = usersRepository.findByNameAndPassword(username, password);
        if (userList.isEmpty()) {
            return "redirect:/login.html";
        } else if (username.endsWith("@sfu.ca")) {
            // user inputed an additional @sfu.ca
            username = username.substring(0, username.length() - "@sfu.ca".length());
        }

        User user = userList.get(0);
        session.setAttribute("session_user", user);
        if (user.isAdmin()) {
            List<User> users = usersRepository.findAll();
            model.addAttribute("users", users);
            return "users/adminPage";
        } else {
            model.addAttribute("currentUser", user);
            return "users/userSchedule";
        }
    }

    @GetMapping("/logout")
    public String destroySession(HttpSession session) {
        session.invalidate();
        return "redirect:/home.html";
    }
}
