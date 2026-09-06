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
public class Patient extends BaseClass{

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 20)
    private String gender;

    @Column(nullable = false, length = 20)
    private String phoneNumber;

    @Column(length = 10)
    private String bloodGroup;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;
}
