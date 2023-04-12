package com.mesi.back.service;

import com.mesi.back.dto.OccurrenceDto;

import java.util.List;

public interface OccurrenceService {
    List<OccurrenceDto> findAll();
}
