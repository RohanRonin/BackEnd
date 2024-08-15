package com.AppDev.FinDoc.controller;
import java.util.List;
import java.util.Optional;

import com.AppDev.FinDoc.entity.HospitalDetails;
import com.AppDev.FinDoc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/")
public class HospitalDetailController {
@Autowired
service service;
@GetMapping("/GetHospitalDetail")
public List<HospitalDetails> showhospital(){
	return service.GetHospitalDetails();
}
@PostMapping("/PostHospitalDetail")
public String  insertHospitalDetials(@RequestBody HospitalDetails h){
	service.insertDetailsHospital(h);
	return "posted successfully";
}
@GetMapping("/HospitalById/{n}")
	public Optional<HospitalDetails> getById(@PathVariable String n){
	return service.selectById(n);
}
}
