package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="teacher_roles",uniqueConstraints=@UniqueConstraint(columnNames={"teacher_id","role"})) @Getter @Setter @NoArgsConstructor
public class TeacherRoleAssignment extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Teacher teacher; @Enumerated(EnumType.STRING) @Column(nullable=false) private TeacherRole role; }
