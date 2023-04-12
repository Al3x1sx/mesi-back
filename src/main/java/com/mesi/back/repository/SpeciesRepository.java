package com.mesi.back.repository;

import com.mesi.back.entity.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface SpeciesRepository extends JpaRepository<Species, Long> {

}
