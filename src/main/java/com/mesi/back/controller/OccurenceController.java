package com.mesi.back.controller;

import com.mesi.back.dto.OccurrenceDto;
import com.mesi.back.entity.Occurrence;
import com.mesi.back.repository.OccurrenceRepository;
import com.mesi.back.service.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("occurence")
public class OccurenceController {


    @Autowired
    OccurrenceService occurrenceService;

    @GetMapping("/")
    public ResponseEntity<List<OccurrenceDto>> getAllOccurrence(){
        return occurrenceService.findAll();
    }

    @PutMapping("/")
    public ResponseEntity<Occurrence> save(Occurrence occurrence){
       return occurrenceService.saveOccurrence(occurrence);

    }

    @PutMapping("/")
    public OccurrenceDto updateOccurrence(OccurrenceDto occurrenceDto){
        return occurrenceService.updateOccurrence(occurrenceDto);
    }


}
