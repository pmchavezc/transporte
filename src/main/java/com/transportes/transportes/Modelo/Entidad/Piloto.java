package com.transportes.transportes.Modelo.Entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Getter
@Setter
@DynamicUpdate
@DynamicInsert
@Entity
@Table(name = "pilotos")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombrePiloto;
    private String apellidoPiloto;
    private String telefonoPiloto;
    private String cuiPiloto;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "piloto")
    private List<Asignacion> asignaciones;

    @ManyToOne
    @JoinColumn(name = "id_tipoLicencia")
    private TipoLicencia tipoLicencia;
}
