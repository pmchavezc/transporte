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
@Table(name = "tipos_licencia")
public class TipoLicencia extends Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "tipoLicencia")
    private List<Piloto> conductorList = new ArrayList<>();

}
