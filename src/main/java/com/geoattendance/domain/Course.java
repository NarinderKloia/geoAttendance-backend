package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="courses", uniqueConstraints=@UniqueConstraint(columnNames={"program_id","code"})) @Getter @Setter @NoArgsConstructor
public class Course extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String code; @Column(nullable=false) private String name; @ManyToOne(optional=false) @JoinColumn(name="program_id") private Program program; }
