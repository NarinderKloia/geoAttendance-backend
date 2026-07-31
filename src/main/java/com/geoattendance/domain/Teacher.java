package com.geoattendance.domain;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;
@Entity @Table(name="teachers") @Getter @Setter @NoArgsConstructor
public class Teacher extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false,unique=true,updatable=false) private String erpId; @Column(nullable=false) private String name; private String fatherName; @Enumerated(EnumType.STRING) private Gender gender; @Column(unique=true) private String phoneNumber; @Column(unique=true) private String email; private String password; private LocalDate dob; @Column(length=1000) private String address; @Enumerated(EnumType.STRING) @Column(nullable=false) private PersonStatus status=PersonStatus.ACTIVE; }
