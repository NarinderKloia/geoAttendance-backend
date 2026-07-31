package com.geoattendance.domain;
import jakarta.persistence.*;
import java.time.Instant;
import lombok.*;
@Entity @Table(name="attendance_records",uniqueConstraints=@UniqueConstraint(columnNames={"classSession_id","student_id"})) @Getter @Setter @NoArgsConstructor
public class AttendanceRecord extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private ClassSession classSession; @ManyToOne(optional=false) private Student student; @Column(nullable=false) private Instant markedAt; @Enumerated(EnumType.STRING) @Column(nullable=false) private AttendanceStatus status; private Boolean faceVerified; private Double faceConfidence; private Boolean geoVerified; private Boolean beaconVerified; @ManyToOne private Room detectedRoom; @Column(length=500) private String rejectionReason; }
