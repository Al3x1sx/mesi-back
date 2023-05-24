package com.mesi.back.service;

import com.mesi.back.dto.SpeciesDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SpeciesService {

    ResponseEntity<List<SpeciesDto>>
    findAll();
}
