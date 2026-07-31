package com.geoattendance.domain;
import jakarta.persistence.*;
import java.time.*;
import lombok.*;
@Entity @Table(name="timetables") @Getter @Setter @NoArgsConstructor
public class Timetable extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Enumerated(EnumType.STRING) @Column(nullable=false) private DayOfWeek dayOfWeek; @ManyToOne(optional=false) private Section section; @ManyToOne(optional=false) private Subject subject; @ManyToOne(optional=false) private Teacher teacher; @ManyToOne(optional=false) private Room room; @Column(nullable=false) private LocalTime periodFrom; @Column(nullable=false) private LocalTime periodTo; }
