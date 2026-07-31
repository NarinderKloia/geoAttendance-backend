package com.geoattendance.domain;
import jakarta.persistence.*;
import java.time.Instant;
import lombok.*;
@Entity @Table(name="attendance_attempts") @Getter @Setter @NoArgsConstructor
public class AttendanceAttempt extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Student student; @ManyToOne(optional=false) private ClassSession classSession; @Column(nullable=false) private Instant attemptedAt; private Double latitude; private Double longitude; private String beaconUuid; private Integer beaconMajor; private Integer beaconMinor; private Boolean faceVerified; private Double faceConfidence; @Column(length=500) private String result; }
