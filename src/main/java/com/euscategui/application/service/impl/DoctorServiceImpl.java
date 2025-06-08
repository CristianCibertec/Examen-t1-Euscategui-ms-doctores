package com.euscategui.application.service.impl;

import com.euscategui.application.mapper.DoctorMapper;
import com.euscategui.application.service.IDoctorService;
import com.euscategui.domain.model.Doctor;
import com.euscategui.domain.repository.IDoctorRepository;
import com.euscategui.web.dto.DoctorRequestDto;
import com.euscategui.web.dto.DoctorResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements IDoctorService {
    private final IDoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    @Override
    public List<DoctorResponseDto> findAll() {
        return doctorRepository.findAll()
                .stream()
                .map(doctorMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorResponseDto findById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor no encontrado con ID: " + id));
        return doctorMapper.toResponseDto(doctor);
    }

    @Override
    public DoctorResponseDto createDoctor(DoctorRequestDto requestDto) {
        Doctor doctor = doctorMapper.toEntity(requestDto);
        Doctor saved = doctorRepository.save(doctor);
        return doctorMapper.toResponseDto(saved);
    }
}
