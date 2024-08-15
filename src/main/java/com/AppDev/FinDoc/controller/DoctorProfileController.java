package com.AppDev.FinDoc.controller;

import com.AppDev.FinDoc.entity.DoctorProfile;
import com.AppDev.FinDoc.service.DoctorProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/doctor-profiles")
public class DoctorProfileController {

    @Autowired
    private DoctorProfileService doctorProfileService;

    @PostMapping
    public ResponseEntity<DoctorProfile> createDoctorProfile(@RequestBody DoctorProfile doctorProfile) {
        try {
            DoctorProfile createdProfile = doctorProfileService.createDoctorProfile(doctorProfile);
            return new ResponseEntity<>(createdProfile, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{uniqueId}")
    public ResponseEntity<DoctorProfile> getDoctorProfile(@PathVariable String uniqueId) {
        DoctorProfile profile = doctorProfileService.getDoctorProfileByUniqueId(uniqueId);
        if (profile != null) {
            return new ResponseEntity<>(profile, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{uniqueId}")
    public ResponseEntity<DoctorProfile> updateDoctorProfile(
            @PathVariable String uniqueId, @RequestBody DoctorProfile doctorProfile) {
        try {
            DoctorProfile updatedProfile = doctorProfileService.updateDoctorProfile(uniqueId, doctorProfile);
            return new ResponseEntity<>(updatedProfile, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{uniqueId}")
    public ResponseEntity<HttpStatus> deleteDoctorProfile(@PathVariable String uniqueId) {
        try {
            doctorProfileService.deleteDoctorProfile(uniqueId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<DoctorProfile>> getAllDoctorProfiles() {
        try {
            List<DoctorProfile> profiles = doctorProfileService.getAllDoctorProfiles();
            if (profiles.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(profiles, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
