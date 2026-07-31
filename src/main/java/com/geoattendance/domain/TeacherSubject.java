package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="teacher_subjects",uniqueConstraints=@UniqueConstraint(columnNames={"teacher_id","subject_id"})) @Getter @Setter @NoArgsConstructor
public class TeacherSubject extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Teacher teacher; @ManyToOne(optional=false) private Subject subject; }
