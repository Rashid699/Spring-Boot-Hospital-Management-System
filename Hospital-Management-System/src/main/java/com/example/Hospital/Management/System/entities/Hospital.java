package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Hospital extends BaseClass {
    @Column(nullable=false, length=100) private String name;
    @Column(nullable=false, length=150) private String location;
    @OneToMany(mappedBy="hospital") private List<Department> departments = new ArrayList<>();
    @OneToMany(mappedBy="hospital") private List<Doctor> doctors = new ArrayList<>();
    @OneToMany(mappedBy="hospital") private List<Patient> patients = new ArrayList<>();
    @OneToMany(mappedBy="hospital") private List<Room> rooms = new ArrayList<>();
}
