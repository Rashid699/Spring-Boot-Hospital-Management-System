package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Department extends BaseClass {
    @Column(nullable=false, length=100) private String name;
    @Column(length=255) private String description;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="hospital_id", nullable=false) private Hospital hospital;
    @OneToMany(mappedBy="department") private List<Doctor> doctors = new ArrayList<>();
    @OneToMany(mappedBy="department") private List<Staff> staff = new ArrayList<>();
}
