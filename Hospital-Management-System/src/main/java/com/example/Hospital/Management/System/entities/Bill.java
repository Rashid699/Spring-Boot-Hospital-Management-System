package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Bill extends BaseClass {
    @Column(nullable=false, precision=12, scale=2) private BigDecimal amount;
    @Column(nullable=false, length=30) private String status;
    @Column(nullable=false) private LocalDate billDate;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="patient_id", nullable=false) private Patient patient;
}
