package com.euscategui.web.dto;

import com.euscategui.domain.model.Doctor;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorRequestDto {
    private String name;
    private String especialidad;
    private Doctor.Estado estado;

}
