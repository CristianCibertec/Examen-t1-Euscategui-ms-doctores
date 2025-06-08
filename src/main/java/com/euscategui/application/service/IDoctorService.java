package com.euscategui.application.service;

import com.euscategui.web.dto.DoctorRequestDto;
import com.euscategui.web.dto.DoctorResponseDto;

import java.util.List;

public interface IDoctorService {
    List<DoctorResponseDto> findAll();
    DoctorResponseDto findById(Long id);
    DoctorResponseDto createDoctor(DoctorRequestDto requestDto);
}
