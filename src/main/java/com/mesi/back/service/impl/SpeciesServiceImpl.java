package com.mesi.back.service.impl;

import com.mesi.back.dto.SpeciesDto;
import com.mesi.back.repository.SpeciesRepository;
import com.mesi.back.service.SpeciesService;
import com.mesi.back.service.mapper.SpeciesMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import static java.util.stream.Collectors.toList;

@Service
@Transactional
public class SpeciesServiceImpl implements SpeciesService {

    @Autowired
    private SpeciesRepository speciesRepository;

    @Autowired
    private SpeciesMapper speciesMapper;

    @Override
    public List<SpeciesDto> findAll() {
        return speciesRepository.findAll().stream().map(species -> speciesMapper.speciesDto(species)).collect(toList());
    }
}
