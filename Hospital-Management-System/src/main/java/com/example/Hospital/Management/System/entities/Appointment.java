package com.example.Hospital.Management.System.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment extends BaseClass{

    @Column(nullable = false)
    private LocalDateTime appointmentDate;

    @Column(nullable = false, length = 255)
    private String reason;

    @Column(nullable = false, length = 30)
    private String status;
}
