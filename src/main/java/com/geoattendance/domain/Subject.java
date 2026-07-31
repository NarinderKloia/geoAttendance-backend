package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="subjects") @Getter @Setter @NoArgsConstructor
public class Subject extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false,unique=true) private String code; @Column(nullable=false) private String name; @Column(nullable=false) private String type; }
