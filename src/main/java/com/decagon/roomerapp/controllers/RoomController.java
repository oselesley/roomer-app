package com.decagon.roomerapp.controllers;

import com.decagon.roomerapp.dtos.RoomDto;
import com.decagon.roomerapp.models.Room;
import com.decagon.roomerapp.models.User;
import com.decagon.roomerapp.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping({"", "/", ".html"})
    public String getRooms(Model model) {
        model.addAttribute("rooms", roomService.getRooms());
        model.addAttribute("newroom", new RoomDto());
        return "rooms";
    }

    @PostMapping("/new")
    public String createRoom(@Valid RoomDto roomDto, BindingResult bindingResult, HttpSession session) {
        Object user = session.getAttribute("user");
        if (user == null) return "redirect:/index";
        roomDto.setUser((User) user);
       RoomDto roomDto1 = roomService.createRoom(roomDto);

       return "redirect:/rooms/" + roomDto1.getId();
    }

    @GetMapping("/{id}")
    public String getRoom(Model model, @PathVariable Long id) {
        System.out.println("in getroom");
        RoomDto roomDto = roomService.getRoomById(id);
        if (roomDto == null) return "redirect:/";
        model.addAttribute("room", roomDto);

        return "room";
    }
}
