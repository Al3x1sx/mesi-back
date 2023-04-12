package com.mesi.back.service;

import com.mesi.back.dto.SpeciesDto;

import java.util.List;

public interface SpeciesService {

    List<SpeciesDto> findAll();
}
