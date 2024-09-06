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
@Table(name = "detalle_orden")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_orden")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_asignacion")
    private Asignacion asignacion;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
