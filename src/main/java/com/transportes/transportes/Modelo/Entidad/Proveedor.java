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
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreProveedor;
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "proveedor")
    private List<Almacen> almacenes;
}
