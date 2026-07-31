package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="student_enrollments",uniqueConstraints=@UniqueConstraint(columnNames={"student_id","section_id"})) @Getter @Setter @NoArgsConstructor
public class StudentEnrollment extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Student student; @ManyToOne(optional=false) private Section section; @Column(nullable=false) private boolean active=true; }
