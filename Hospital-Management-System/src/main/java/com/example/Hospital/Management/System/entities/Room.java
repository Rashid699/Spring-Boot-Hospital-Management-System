package com.example.Hospital.Management.System.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room extends BaseClass{
    @Column(
            nullable = false,
            unique = true,
            length = 30
    )
    private String roomNumber;

    @Column(nullable = false)
    private Integer floor;

    @Column(nullable = false, length = 50)
    private String type;

    @Column(nullable = false)
    private Integer capacity;
}
