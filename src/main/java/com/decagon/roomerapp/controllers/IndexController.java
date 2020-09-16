package com.decagon.roomerapp.controllers;


import com.decagon.roomerapp.dtos.UserDto;
import com.decagon.roomerapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping({"", "/", "/index", "index.html"})
    public String index(@ModelAttribute("invalid") String invalid,
                        @ModelAttribute("success") String success,
                        HttpSession session, Model model) {

        Object user = session.getAttribute("user");
        if (user != null) model.addAttribute("user", (User) user);
        model.addAttribute("newUser", new UserDto());
        model.addAttribute("invalid", invalid);
        model.addAttribute("success", success);
        if (!invalid.isEmpty() || !success.isEmpty()) return "auth";
        return "index";
    }
}
