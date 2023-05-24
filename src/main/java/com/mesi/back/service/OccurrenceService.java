package com.mesi.back.service;

import com.mesi.back.dto.OccurrenceDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OccurrenceService {
    ResponseEntity<List<OccurrenceDto>> findAll();
}
