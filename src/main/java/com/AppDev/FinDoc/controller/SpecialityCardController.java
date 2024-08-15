package com.AppDev.FinDoc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AppDev.FinDoc.entity.SpecialityCard;
import com.AppDev.FinDoc.service.*;
@RestController
public class SpecialityCardController {
    @Autowired
    service service;
    @GetMapping("/specialityCardGet")
    public List<SpecialityCard> getSpecialityCard(){
        return service.getSpecialityCard();
    }
    @PostMapping("/specialityCardPost")
    public String postSpecialityCard(@RequestBody SpecialityCard s){
        service.postCardSpeciality(s);
        return "Posted Successfully";
    }
    @GetMapping("/SpecialityCardById/{n}")
    public Optional<SpecialityCard> getById(@PathVariable int n){
          return service.SpecialityById(n);
    }
}
