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
@Table(name = "asignaciones")
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_piloto")
    private Piloto piloto;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo vehiculo;

    @OneToMany(mappedBy = "asignacion")
    private List<DetalleOrden> detalleOrdenes;
}
