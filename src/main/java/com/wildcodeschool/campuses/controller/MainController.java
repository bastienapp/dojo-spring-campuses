package com.wildcodeschool.campuses.controller;

import java.util.ArrayList;
import java.util.List;

import com.wildcodeschool.campuses.model.Campus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/campuses")
    public String campusesRoutes(Model out){
       
        String firstName = "Anna";
        out.addAttribute("firstName", firstName);

        Campus nantes = new Campus("Nantes", "c'est super!", "team/nantes");
        Campus toulouse = new Campus("Toulouse", "vive la chocolatine", "team/toulouse");
        Campus bordeaux = new Campus("Bordeaux", "j'ai rien à dire sur Bordeaux si il y a des bouchons et des bourgeois et des accents à la con", "team/loser");

        List<Campus> wild = new ArrayList<>();

        wild.add(nantes);
        wild.add(toulouse);
        wild.add(bordeaux);

        out.addAttribute("campusList", wild);
        
        return "campus";
    }

}