package com.upc.practica1.projectbienestarcompany.dtos;

import com.upc.practica1.projectbienestarcompany.entities.Rol;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioDTO {
    private int id;

    private String usuario;

    private String contrasena;

    private String nombre;

    private String apellido;

    private int edad;

    private String correo;

    private Boolean enabled;

    private Rol rol;
}
