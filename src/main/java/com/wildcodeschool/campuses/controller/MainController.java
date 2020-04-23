package com.wildcodeschool.campuses.controller;

import java.util.ArrayList;
import java.util.List;

import com.wildcodeschool.campuses.model.Campus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
/campuses
/team
*/

@Controller
public class MainController{


    @GetMapping("/campuses")
    public String campusController(Model model) {

        Campus nantes = new Campus("Nantes", "Super campus", "/team/nantes");
        Campus biarritz = new Campus("Biarritz", "Moyen campus", "/team/biarritz");
        Campus paris = new Campus("Paris", "Campus polué", "/team/paris");

        List<Campus> listCampus = new ArrayList<>();
        listCampus.add(nantes);
        listCampus.add(biarritz);
        listCampus.add(paris);
        Boolean logged;
        logged = false;
        model.addAttribute("listCampus",listCampus);
        model.addAttribute("logged", logged);

        return "campus"; 
    }
    




}