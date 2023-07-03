package com.mesi.back.service.impl;

import com.mesi.back.dto.OccurrenceDto;
import com.mesi.back.entity.Occurrence;
import com.mesi.back.repository.OccurrenceRepository;
import com.mesi.back.service.OccurrenceService;
import com.mesi.back.service.mapper.OccurrenceMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.jpa.repository.Modifying;
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

    public ResponseEntity<Occurrence> saveOccurrence(Occurrence occ){

        Occurrence occurrence = occurrenceRepository.save(occ);
        if(occurrence==null){
            new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(occurrence,HttpStatus.OK);


    }

    @Modifying
    @Override
    public OccurrenceDto updateOccurrence(OccurrenceDto occurrenceDto) {
        Occurrence occurrence = occurrenceRepository.findById(occurrenceDto.getId()).orElse(null);
        OccurrenceDto occurrenceDto1 = null;
        if(occurrence!=null){
            Occurrence occurenceModif = occurrenceRepository.save(occurrence);
             occurrenceDto1 = occurrenceMapper.occurrenceDto(occurenceModif);
        }else{
            new ChangeSetPersister.NotFoundException();
        }
    return occurrenceDto1;
    }

    public ResponseEntity<OccurrenceDto> deleteOccurrence(Long occurrenceId) {
        Occurrence occurrence = occurrenceRepository.findById(occurrenceId).orElse(null);
        if (occurrence!=null) {
            return ResponseEntity.notFound().build();
        }

        occurrenceRepository.delete(occurrence);

        OccurrenceDto deletedOccurrenceDto = occurrenceMapper.occurrenceDto(occurrence);

        return ResponseEntity.ok(deletedOccurrenceDto);
    }




}
