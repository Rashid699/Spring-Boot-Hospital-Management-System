package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MedicalRecord extends BaseClass {
    @Column(nullable=false, length=255) private String diagnosis;
    @Column(length=1000) private String notes;
    @Column(nullable=false) private LocalDate recordDate;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="patient_id", nullable=false) private Patient patient;
    @OneToMany(mappedBy="medicalRecord") private List<Prescription> prescriptions = new ArrayList<>();
}
