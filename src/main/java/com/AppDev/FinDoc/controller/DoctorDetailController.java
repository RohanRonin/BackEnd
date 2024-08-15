package com.AppDev.FinDoc.controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.AppDev.FinDoc.entity.DoctorDetails;
import com.AppDev.FinDoc.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
public class DoctorDetailController {
    @Autowired 
    service service;
    
    @GetMapping("/doctorDetailGet")
    public List<DoctorDetails> getDoctorDetail(){
        return service.getDetailDoctor();
    }
    @PostMapping("/doctorDetailPost")
    public String postDoctorDetail(@RequestBody DoctorDetails d){
        service.postDetailDoctor(d);
        return "Posted Successfully";
    }
    @GetMapping("/DoctorDetailById/{n}")
    public Optional<DoctorDetails> getById(@PathVariable int n){
        return service.getById(n);
    }
}
