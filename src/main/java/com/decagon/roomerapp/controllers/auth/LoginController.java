package com.decagon.roomerapp.controllers.auth;

import com.decagon.roomerapp.dtos.UserDto;
import com.decagon.roomerapp.models.User;
import com.decagon.roomerapp.services.UserService;
import com.decagon.roomerapp.utils.BcryptHasher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class LoginController {
    UserService userService;
    BcryptHasher bcryptHasher;

    public LoginController(UserService userService, BcryptHasher bcryptHasher) {
        this.userService = userService;
        this.bcryptHasher = bcryptHasher;
    }


    @PostMapping("/login")
    public String login(@Valid UserDto userDto,
                        BindingResult result, Model model,
                        HttpSession session,
                        RedirectAttributes redirectAttributes) throws Exception {
        User user = userService.getUser(userDto.getEmail());
        if (user == null || !bcryptHasher.checkPassword(user.getPassword(), userDto.getPassword())) {
            redirectAttributes.addAttribute("invalid", "invalid username and password!");
            return "redirect:/";
        }
        session.setAttribute("user", user);
        return "redirect:/";
    }
}
