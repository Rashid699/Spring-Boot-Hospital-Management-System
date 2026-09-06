package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Guardian extends BaseClass {
    @Column(nullable=false, length=100) private String name;
    @Column(nullable=false, length=50) private String relationship;
    @Column(nullable=false, length=20) private String phoneNumber;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="patient_id", nullable=false) private Patient patient;
}
