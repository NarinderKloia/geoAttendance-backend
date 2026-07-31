package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="sections", uniqueConstraints=@UniqueConstraint(columnNames={"course_id","name","academicYear"})) @Getter @Setter @NoArgsConstructor
public class Section extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String name; @Column(nullable=false) private String academicYear; @ManyToOne(optional=false) private Course course; }
