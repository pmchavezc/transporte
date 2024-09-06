package com.transportes.transportes.Modelo.Entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "lat_long")
public class LatLong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String latitud;
    private String longitud;

    @OneToMany(mappedBy = "latLong")
    private List<Orden> ordenes;
}
