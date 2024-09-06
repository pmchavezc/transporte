package com.transportes.transportes.Modelo.Entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Email;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

@Getter
@Setter
@DynamicUpdate
@DynamicInsert
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre de usuario no puede estar vacío")
    private  String nombreUsuario;
    private boolean habilitado;

    @NotEmpty (message = "El correo no puede estar vacío")
    @Email (message = "El correo debe ser válido")
    private String correo;

    @NotEmpty (message = "La contraseña no puede estar vacía")
    private String password;

    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;

    @OneToOne(mappedBy = "usuario")
    private Piloto piloto;

}
