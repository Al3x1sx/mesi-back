package com.mesi.back.service;

import com.mesi.back.dto.OccurrenceDto;
import com.mesi.back.entity.Occurrence;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OccurrenceService {
    ResponseEntity<List<OccurrenceDto>> findAll();

    OccurrenceDto updateOccurrence(OccurrenceDto occurrenceDto);

    public ResponseEntity<Occurrence> saveOccurrence(Occurrence occ);
}
