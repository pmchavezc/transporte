package com.transportes.transportes.Modelo.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String marca;
    private String anio;
    private String linea;
    private String color;

    @ManyToOne
    @JoinColumn(name = "id_tipo_vehiculo")
    private TipoVehiculo tipoVehiculo;

    @ManyToOne
    @JoinColumn(name = "id_tipo_combustible")
    private TipoCombustible tipoCombustible;

    @OneToMany(mappedBy = "vehiculo")
    private List<Asignacion> asignacionList = new ArrayList<>();

}
