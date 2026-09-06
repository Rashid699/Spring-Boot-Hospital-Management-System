package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Doctor extends BaseClass {
    @Column(nullable=false, length=100) private String name;
    @Column(nullable=false, unique=true, length=150) private String email;
    @Column(nullable=false, length=20) private String phoneNumber;
    @Column(nullable=false, length=100) private String specialization;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="department_id", nullable=false) private Department department;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="hospital_id", nullable=false) private Hospital hospital;
    @OneToMany(mappedBy="doctor") private List<Appointment> appointments = new ArrayList<>();
}
