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
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fechaOrden;
    private String fechaEntrega;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "orden")
    private List<DetalleOrden> detalleOrdenes;

    @ManyToOne
    @JoinColumn(name = "id_latLong")
    private LatLong latLong;

    @ManyToOne
    @JoinColumn(name = "id_tipoServicio")
    private TipoServicio tipoServicio;

}
