package com.euscategui.web.controller;

import com.euscategui.application.service.IDoctorService;
import com.euscategui.web.dto.DoctorRequestDto;
import com.euscategui.web.dto.DoctorResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctores")
@RequiredArgsConstructor
public class DoctorController {
    private final IDoctorService doctorService;

    @GetMapping
    public ResponseEntity<List<DoctorResponseDto>> getAll() {
        return ResponseEntity.ok(doctorService.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<DoctorResponseDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(doctorService.findById(id));
    }


    @PostMapping
    public ResponseEntity<DoctorResponseDto> create(@RequestBody DoctorRequestDto requestDto) {
        return ResponseEntity.ok(doctorService.createDoctor(requestDto));
    }
}
