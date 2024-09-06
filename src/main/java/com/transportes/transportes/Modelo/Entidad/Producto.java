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
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreProducto;

    @OneToMany(mappedBy = "producto")
    private List<ProductoAlmacen> productoAlmacen;

    @OneToMany(mappedBy = "producto")
    private List<DetalleOrden> detalleOrden;

}
