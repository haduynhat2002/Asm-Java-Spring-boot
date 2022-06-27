package com.example.asmspringboot.entity;

import com.example.asmspringboot.entity.myemun.RoadStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roads")
public class Road {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="district_id", nullable = false)
    private District district;
    @Column(updatable = false, insertable = false)
    private int district_id;
    private String founding;
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private RoadStatus status;

}
