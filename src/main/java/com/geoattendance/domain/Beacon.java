package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="beacons",uniqueConstraints=@UniqueConstraint(columnNames={"uuid","majorValue","minorValue"})) @Getter @Setter @NoArgsConstructor
public class Beacon extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String label; @ManyToOne(optional=false) private Floor floor; @Column(nullable=false) private String uuid; @Column(nullable=false) private Integer majorValue; @Column(nullable=false) private Integer minorValue; private boolean active=true; }
