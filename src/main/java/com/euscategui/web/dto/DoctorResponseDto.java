package com.euscategui.web.dto;

import com.euscategui.domain.model.Doctor;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorResponseDto {
    private Long id;
    private String name;
    private String especialidad;
    private Doctor.Estado estado;
}
