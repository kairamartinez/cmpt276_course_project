package cmpt276.courseproject.cmpt276_course_project.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cmpt276.courseproject.cmpt276_course_project.models.UserRepository;
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

    // Only for debugging, delete this when dont so there is no outside access to db info
    @GetMapping("/users/view")
    public String getAllUsers(Model model) {
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users/adminPage";
    }

    @PostMapping("/users/register")
    public String addUser(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
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
            // Handle the login failure case, e.g., by using redirect attributes to pass an error message
            return "redirect:/login.html?error=true";
        }
    
        User user = userList.get(0);
        session.setAttribute("session_user", user);
        // Redirecting to a generic welcome page, not specific to user roles for simplicity
        return "redirect:/welcome.html";
    }

    @GetMapping("/api/userinfo")
@ResponseBody
public Map<String, Object> getUserInfo(HttpSession session) {
    User user = (User) session.getAttribute("session_user");
    if (user != null) {
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put("name", user.getName());
        return userInfo;
    } else {
        // Handle the case where there is no user in the session, perhaps redirect to the login page
        return Collections.singletonMap("error", "User not found in session");
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
        return "redirect:/login.html"; // Redirects directly to the static HTML page
    }
}    
