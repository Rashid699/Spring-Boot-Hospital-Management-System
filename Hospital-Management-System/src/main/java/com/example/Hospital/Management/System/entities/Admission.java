package com.example.Hospital.Management.System.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admission extends BaseClass{

    @Column(nullable = false)
    private LocalDate admitDate;

}
