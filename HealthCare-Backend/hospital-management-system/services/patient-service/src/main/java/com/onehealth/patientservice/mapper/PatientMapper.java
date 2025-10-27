package com.onehealth.patientservice.mapper;

import com.onehealth.patientservice.dto.PatientRequestDTO;
import com.onehealth.patientservice.dto.PatientResponseDTO;
import com.onehealth.patientservice.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "patientNumber", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "medicalHistories", ignore = true)
    Patient toEntity(PatientRequestDTO dto);

    PatientResponseDTO toDto(Patient entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "patientNumber", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "medicalHistories", ignore = true)
    void updateEntityFromDto(PatientRequestDTO dto, @MappingTarget Patient entity);
}