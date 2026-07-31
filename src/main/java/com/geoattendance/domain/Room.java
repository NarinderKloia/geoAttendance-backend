package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="rooms") @Getter @Setter @NoArgsConstructor
public class Room extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Floor floor; @Column(nullable=false,unique=true) private String roomCode; @Column(nullable=false) private String name; private Double centerLatitude; private Double centerLongitude; private Double allowedRadiusMeters; private Double northLatitude; private Double northLongitude; private Double southLatitude; private Double southLongitude; private Double eastLatitude; private Double eastLongitude; private Double westLatitude; private Double westLongitude; }
