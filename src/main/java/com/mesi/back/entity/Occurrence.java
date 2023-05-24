package com.mesi.back.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Occurrence {

    @Id
    private Long id;

    @Column
    private float longitude;

    @Column
    private float latitude;

    @ManyToOne
    private Species species;


}
