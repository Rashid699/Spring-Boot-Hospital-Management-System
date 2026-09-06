package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Admission extends BaseClass {
    @Column(nullable=false) private LocalDate admitDate;
    private LocalDate dischargeDate;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="patient_id", nullable=false) private Patient patient;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="room_id", nullable=false) private Room room;
}
