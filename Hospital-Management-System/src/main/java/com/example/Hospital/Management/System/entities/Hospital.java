package com.example.Hospital.Management.System.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 150)
    private String location;

    @OneToMany(mappedBy = "hospital")
    private List<Department> departments = new ArrayList<>();

    @OneToMany(mappedBy = "hospital")
    private List<Patient> patients = new ArrayList<>();

    @OneToMany(mappedBy = "hospital")
    private List<Room> rooms = new ArrayList<>();

}
