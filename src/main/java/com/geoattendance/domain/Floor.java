package com.geoattendance.domain;
import jakarta.persistence.*;
import lombok.*;
@Entity @Table(name="floors",uniqueConstraints=@UniqueConstraint(columnNames={"block_id","floorNumber"})) @Getter @Setter @NoArgsConstructor
public class Floor extends AuditableEntity { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false) private Block block; @Column(nullable=false) private String name; @Column(nullable=false) private Integer floorNumber; }
