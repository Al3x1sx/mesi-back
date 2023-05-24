package com.mesi.back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity represent a species
 */
@Getter
@Setter
@Entity
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String frenchName;

    @Column
    private String scientificName;

    @Column
    private String genericName;

    @Column
    private String speciesName;

    @Column
    private String genus;

    @Column
    private String family;

    @Column
    private String order;

    @Column
    private String phylum;

    @Column
    private String kingdom;

    @Column
    private String media;


}
