package com.mesi.back.service.mapper;

import com.mesi.back.dto.OccurrenceDto;
import com.mesi.back.entity.Occurrence;
import org.springframework.stereotype.Component;

@Component
public class OccurrenceMapper {

    public OccurrenceDto occurrenceDto(Occurrence occurrence) {
        return new OccurrenceDto(occurrence.getId(), occurrence.getLongitude(), occurrence.getLatitude());
    }


}
