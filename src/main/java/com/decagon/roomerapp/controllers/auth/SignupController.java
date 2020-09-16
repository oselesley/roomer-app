package com.decagon.roomerapp.controllers.auth;

import com.decagon.roomerapp.dtos.UserDto;
import com.decagon.roomerapp.models.User;
import com.decagon.roomerapp.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class SignupController {
    UserService userService;

    public SignupController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public String signup(@Valid UserDto userDto, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        userService.createUser(userDto);
        redirectAttributes.addAttribute("success", "you've been signed up succesfully!!");
        return "redirect:/";
    }
}
