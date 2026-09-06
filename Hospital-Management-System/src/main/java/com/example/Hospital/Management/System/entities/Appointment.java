package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Appointment extends BaseClass {
    @Column(nullable=false) private LocalDateTime appointmentDate;
    @Column(nullable=false, length=255) private String reason;
    @Column(nullable=false, length=30) private String status;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="doctor_id", nullable=false) private Doctor doctor;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="patient_id", nullable=false) private Patient patient;
}
