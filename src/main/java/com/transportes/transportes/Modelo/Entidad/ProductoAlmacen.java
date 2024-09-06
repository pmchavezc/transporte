package com.transportes.transportes.Modelo.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "producto_almacen")
public class ProductoAlmacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long precio;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_almacen")
    private Almacen almacen;
}
