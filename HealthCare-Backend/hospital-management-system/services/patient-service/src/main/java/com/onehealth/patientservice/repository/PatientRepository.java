package com.onehealth.patientservice.repository;

import com.onehealth.patientservice.entity.Patient;
import com.onehealth.patientservice.entity.PatientStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findByPatientNumber(String patientNumber);

    Optional<Patient> findByNationalId(String nationalId);

    Optional<Patient> findByEmail(String email);

    boolean existsByNationalId(String nationalId);

    boolean existsByEmail(String email);

    Page<Patient> findByStatus(PatientStatus status, Pageable pageable);

    @Query("SELECT p FROM Patient p WHERE " +
            "LOWER(p.firstName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(p.lastName) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(p.patientNumber) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
            "LOWER(p.nationalId) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    Page<Patient> searchPatients(@Param("searchTerm") String searchTerm, Pageable pageable);
}