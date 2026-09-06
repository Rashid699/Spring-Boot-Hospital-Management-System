package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Prescription extends BaseClass {
    @Column(nullable=false, length=120) private String medicineName;
    @Column(nullable=false, length=100) private String dosage;
    @Column(nullable=false) private Integer durationDays;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="medical_record_id", nullable=false) private MedicalRecord medicalRecord;
}
