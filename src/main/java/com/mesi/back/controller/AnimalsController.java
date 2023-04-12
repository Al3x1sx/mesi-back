package com.mesi.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mesi/back")
public class AnimalsController {

    //TODO pleaaase
    @GetMapping("animals")
    public String testMapping() {
        System.out.println(new String("Hello"));
        return "Bonjouuuuur";
    }


}
