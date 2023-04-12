package com.mesi.back.dto;

public class SpeciesDto {

    private Long id;
    private String frenchName;
    private String scientificName;
    private String genericName;
    private String speciesName;
    private String genus;
    private String family;
    private String order;
    private String phylum;
    private String kingdom;
    private String media;

    public SpeciesDto(Long id, String frenchName, String scientificName, String genericName, String speciesName, String genus, String family, String order, String phylum, String kingdom, String media) {
        this.id = id;
        this.frenchName = frenchName;
        this.scientificName = scientificName;
        this.genericName = genericName;
        this.speciesName = speciesName;
        this.genus = genus;
        this.family = family;
        this.order = order;
        this.phylum = phylum;
        this.kingdom = kingdom;
        this.media = media;
    }

    public SpeciesDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrenchName() {
        return frenchName;
    }

    public void setFrenchName(String frenchName) {
        this.frenchName = frenchName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
}
