package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Room extends BaseClass {
    @Column(nullable=false, unique=true, length=30) private String roomNumber;
    @Column(nullable=false) private Integer floor;
    @Column(nullable=false, length=50) private String type;
    @Column(nullable=false) private Integer capacity;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="hospital_id", nullable=false) private Hospital hospital;
    @OneToMany(mappedBy="room") private List<Admission> admissions = new ArrayList<>();
}
