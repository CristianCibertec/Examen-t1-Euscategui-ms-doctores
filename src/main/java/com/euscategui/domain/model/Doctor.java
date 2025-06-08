package com.euscategui.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "doctor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String name;
    private String especialidad;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    public enum Estado {
        ACTIVO,
        INACTIVO
    }
}
