package com.springframework.controllers;

import com.springframework.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//added this annotation for a controller service
@Controller
public class JokeController {

    private JokeService jokeService;

    //added this annotation for an Autowired service
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    //Added request map annotation
    //When getting a request this method will be invoked
    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
