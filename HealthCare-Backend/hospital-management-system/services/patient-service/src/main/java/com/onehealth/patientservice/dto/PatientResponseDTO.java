package com.onehealth.patientservice.dto;


import com.onehealth.patientservice.entity.BloodType;
import com.onehealth.patientservice.entity.Gender;
import com.onehealth.patientservice.entity.PatientStatus;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientResponseDTO {
    private Long id;
    private String patientNumber;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String nationalId;
    private String email;
    private String phoneNumber;
    private AddressDTO address;
    private BloodType bloodType;
    private String allergies;
    private String chronicConditions;
    private List<EmergencyContactDTO> emergencyContacts;
    private PatientStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}