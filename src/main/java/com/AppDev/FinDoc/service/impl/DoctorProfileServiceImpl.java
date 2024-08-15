package com.AppDev.FinDoc.service.impl;

import com.AppDev.FinDoc.entity.DoctorProfile;
import com.AppDev.FinDoc.repository.DoctorProfileRepository;
import com.AppDev.FinDoc.service.DoctorProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorProfileServiceImpl implements DoctorProfileService {

    @Autowired
    private DoctorProfileRepository doctorProfileRepository;

    @Override
    public DoctorProfile createDoctorProfile(DoctorProfile doctorProfile) {
        return doctorProfileRepository.save(doctorProfile);
    }

    @Override
    public DoctorProfile getDoctorProfileByUniqueId(String uniqueId) {
        Optional<DoctorProfile> optionalProfile = doctorProfileRepository.findById(uniqueId);
        return optionalProfile.orElse(null);
    }

    @Override
    public List<DoctorProfile> getAllDoctorProfiles() {
        return doctorProfileRepository.findAll();
    }

    @Override
    public DoctorProfile updateDoctorProfile(String uniqueId, DoctorProfile doctorProfile) {
        Optional<DoctorProfile> optionalProfile = doctorProfileRepository.findById(uniqueId);
        if (optionalProfile.isPresent()) {
            DoctorProfile existingProfile = optionalProfile.get();
            // Update the fields of the existing profile with the new values
            existingProfile.setFirstName(doctorProfile.getFirstName());
            existingProfile.setLastName(doctorProfile.getLastName());
            existingProfile.setAge(doctorProfile.getAge());
            existingProfile.setGender(doctorProfile.getGender());
            existingProfile.setEmail(doctorProfile.getEmail());
            existingProfile.setMobileNumber(doctorProfile.getMobileNumber());
            existingProfile.setMaritalStatus(doctorProfile.getMaritalStatus());
            existingProfile.setQualification(doctorProfile.getQualification());
            existingProfile.setDesignation(doctorProfile.getDesignation());
            existingProfile.setBloodGroup(doctorProfile.getBloodGroup());
            existingProfile.setAddress(doctorProfile.getAddress());
            existingProfile.setCountry(doctorProfile.getCountry());
            existingProfile.setState(doctorProfile.getState());
            existingProfile.setCity(doctorProfile.getCity());
            existingProfile.setPostalCode(doctorProfile.getPostalCode());
            existingProfile.setBio(doctorProfile.getBio());
            existingProfile.setProfilePhoto(doctorProfile.getProfilePhoto());
            existingProfile.setAvailability(doctorProfile.getAvailability());
            existingProfile.setUsername(doctorProfile.getUsername());
            existingProfile.setPassword(doctorProfile.getPassword());

            return doctorProfileRepository.save(existingProfile);
        } else {
            return null;
        }
    }

    @Override
    public void deleteDoctorProfile(String uniqueId) {
        doctorProfileRepository.deleteById(uniqueId);
    }
}
