package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Patient extends BaseClass {
    @Column(nullable=false, length=100) private String name;
    @Column(nullable=false, length=20) private String gender;
    @Column(nullable=false, length=20) private String phoneNumber;
    @Column(length=10) private String bloodGroup;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="hospital_id", nullable=false) private Hospital hospital;
    @OneToMany(mappedBy="patient") private List<Appointment> appointments = new ArrayList<>();
    @OneToMany(mappedBy="patient") private List<MedicalRecord> medicalRecords = new ArrayList<>();
    @OneToMany(mappedBy="patient") private List<Guardian> guardians = new ArrayList<>();
    @OneToMany(mappedBy="patient") private List<Admission> admissions = new ArrayList<>();
    @OneToMany(mappedBy="patient") private List<Bill> bills = new ArrayList<>();
}
