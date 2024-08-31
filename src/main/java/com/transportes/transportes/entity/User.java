package com.transportes.transportes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String correo;
    private boolean habilitado;
    private String nombre_usuario;
    private String password;
    private String tipo_usuario;
    private int rol_id;
    private LocalDateTime fecha_creacion;
}
