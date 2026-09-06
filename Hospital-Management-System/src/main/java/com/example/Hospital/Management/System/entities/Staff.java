package com.example.Hospital.Management.System.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Staff extends BaseClass {
    @Column(nullable=false, length=100) private String name;
    @Column(nullable=false, length=60) private String role;
    @Column(nullable=false, length=20) private String phoneNumber;
    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="department_id", nullable=false) private Department department;
}
