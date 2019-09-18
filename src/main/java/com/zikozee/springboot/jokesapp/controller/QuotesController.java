package com.zikozee.springboot.jokesapp.controller;

import com.zikozee.springboot.jokesapp.service.ChuckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuotesController {
    private ChuckService chuckService;

    public QuotesController(ChuckService chuckService) {
        this.chuckService = chuckService;
    }

    @GetMapping({"/",""})
    public String quoter(Model model){

        String joke= chuckService.getRandomQuote();

        model.addAttribute("joke",joke);

        return "chucknorris";
    }
}
