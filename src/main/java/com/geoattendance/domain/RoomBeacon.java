package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="room_beacons",uniqueConstraints=@UniqueConstraint(columnNames={"room_id","beacon_id"})) @Getter @Setter @NoArgsConstructor
public class RoomBeacon extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Room room; @ManyToOne(optional=false) private Beacon beacon; }
