package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="programs", uniqueConstraints=@UniqueConstraint(columnNames="name")) @Getter @Setter @NoArgsConstructor
public class Program extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String name; }
