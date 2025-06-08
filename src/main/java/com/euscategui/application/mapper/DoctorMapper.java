package com.euscategui.application.mapper;

import com.euscategui.domain.model.Doctor;
import com.euscategui.web.dto.DoctorRequestDto;
import com.euscategui.web.dto.DoctorResponseDto;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {
    public Doctor toEntity(DoctorRequestDto dto) {
        return Doctor.builder()
                .name(dto.getName())
                .especialidad(dto.getEspecialidad())
                .estado(dto.getEstado())
                .build();
    }
    public DoctorResponseDto toResponseDto(Doctor doctor) {
        return DoctorResponseDto.builder()
                .id(doctor.getId())
                .name(doctor.getName())
                .especialidad(doctor.getEspecialidad())
                .estado(doctor.getEstado())
                .build();
    }
}
