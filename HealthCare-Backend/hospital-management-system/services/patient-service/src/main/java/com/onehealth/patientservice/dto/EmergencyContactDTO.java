package com.onehealth.patientservice.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
class EmergencyContactDTO {
    @NotBlank(message = "Full name is required")
    private String fullName;

    @NotBlank(message = "Relationship is required")
    private String relationship;

    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @Email
    private String email;
}