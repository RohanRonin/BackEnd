package com.AppDev.FinDoc.service;

import com.AppDev.FinDoc.entity.DoctorProfile;

import java.util.List;

public interface DoctorProfileService {
    DoctorProfile createDoctorProfile(DoctorProfile doctorProfile);
    DoctorProfile getDoctorProfileByUniqueId(String uniqueId);
    List<DoctorProfile> getAllDoctorProfiles();
    DoctorProfile updateDoctorProfile(String uniqueId, DoctorProfile doctorProfile);
    void deleteDoctorProfile(String uniqueId);
}
