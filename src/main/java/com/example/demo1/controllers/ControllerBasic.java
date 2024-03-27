package com.example.demo1.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.models.Poster;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/home")
public class ControllerBasic {

    public List<Poster> getPosters() {
        ArrayList<Poster> poster = new ArrayList<>();

        poster.add(new Poster(1, "John es grande", "Bigh grande", "http://localhost/ima/poster.jpg", new Date()));
        poster.add(new Poster(2, "John es grande", "Bigh grande", "http://localhost/ima/poster.jpg", new Date()));
        poster.add(new Poster(3, "John es grande", "Bigh grande", "http://localhost/ima/poster.jpg", new Date()));
        poster.add(new Poster(4, "John es grande", "Bigh grande", "http://localhost/ima/poster.jpg", new Date()));

        return poster;
    }

    @GetMapping(path = { "/poster", "/" })
    public String getName(Model model) {

        model.addAttribute("poster", this.getPosters());
        return "index";
    }
}
