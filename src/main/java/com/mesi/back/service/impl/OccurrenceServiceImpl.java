package com.mesi.back.service.impl;

import com.mesi.back.dto.OccurrenceDto;
import com.mesi.back.repository.OccurrenceRepository;
import com.mesi.back.service.OccurrenceService;
import com.mesi.back.service.mapper.OccurrenceMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@Transactional
public class OccurrenceServiceImpl implements OccurrenceService {
    @Autowired
    private OccurrenceRepository occurrenceRepository;

    @Autowired
    private OccurrenceMapper occurrenceMapper;

    @Override
    public ResponseEntity<List<OccurrenceDto>> findAll() {
        List<OccurrenceDto> occurrenceDtoList =  occurrenceRepository.findAll().stream().map(occurrence -> occurrenceMapper.occurrenceDto(occurrence)).collect(toList());
        if(occurrenceDtoList==null){
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(occurrenceDtoList,HttpStatus.OK);
    }
}
