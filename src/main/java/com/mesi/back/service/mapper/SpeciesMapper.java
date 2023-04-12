package com.mesi.back.service.mapper;

import com.mesi.back.dto.SpeciesDto;
import com.mesi.back.entity.Species;
import org.springframework.stereotype.Component;

@Component
public class SpeciesMapper {

    public SpeciesDto speciesDto(Species species) {
        return new SpeciesDto(
                species.getId(),
                species.getFrenchName(),
                species.getScientificName(),
                species.getGenericName(),
                species.getSpeciesName(),
                species.getGenus(),
                species.getFamily(),
                species.getOrder(),
                species.getPhylum(),
                species.getKingdom(),
                species.getMedia());
    }
}
