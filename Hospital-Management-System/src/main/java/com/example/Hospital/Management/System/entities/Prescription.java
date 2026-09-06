package com.example.Hospital.Management.System.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prescription extends BaseClass{

    @Column(nullable = false, length = 120)
    private String medicineName;

    @Column(nullable = false, length = 100)
    private String dosage;

    @Column(nullable = false)
    private Integer durationDays;

    @ManyToOne
    @JoinColumn(
            name = "medical_record_id",
            nullable = false
    )
    private MedicalRecord medicalRecord;
}
