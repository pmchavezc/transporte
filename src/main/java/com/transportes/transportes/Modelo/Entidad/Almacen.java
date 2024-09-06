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
@Table(name = "almacenes")
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreAlmacen;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @OneToMany(mappedBy = "almacen")
    private List<ProductoAlmacen> productoAlmacen;
}
