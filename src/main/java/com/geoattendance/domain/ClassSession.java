package com.geoattendance.domain;
import jakarta.persistence.*;
import java.time.*;
import lombok.*;
@Entity @Table(name="class_sessions",uniqueConstraints=@UniqueConstraint(columnNames={"timetable_id","sessionDate"})) @Getter @Setter @NoArgsConstructor
public class ClassSession extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Timetable timetable; @Column(nullable=false) private LocalDate sessionDate; @Column(nullable=false) private Instant opensAt; @Column(nullable=false) private Instant closesAt; @Enumerated(EnumType.STRING) @Column(nullable=false) private SessionStatus status=SessionStatus.SCHEDULED; }
