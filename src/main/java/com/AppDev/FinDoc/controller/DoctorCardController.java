package com.AppDev.FinDoc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.AppDev.FinDoc.entity.DoctorCard;

import java.util.List;
import java.util.Optional;
import com.AppDev.FinDoc.service.*;
@RestController
@CrossOrigin("*")
public class DoctorCardController {
    @Autowired
    service service;
    @GetMapping("/doctorCardGet")
    public List<DoctorCard> getDoctorCard(){
        return service.getAllDoctorCard();
    }
    @PostMapping("/doctorCardPost")
    public String postDoctorCard(@RequestBody DoctorCard d){
        service.postDoctorCardItems(d);
        return "Posted Successfully";

    }
    @GetMapping("/DoctorCardGetById/{n}")
    public Optional<DoctorCard> getById(@PathVariable int n){
        return service.getDoctorCardById(n);
    }
}
