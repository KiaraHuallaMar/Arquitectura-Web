package com.upc.practica1.projectbienestarcompany.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "usuario", length = 50, nullable = false, unique = true )
    private String usuario;

    @Column(name = "contrasena", length = 200, nullable = false )
    private String contrasena;

    @Column(name = "nombre", length = 50, nullable = false )
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false )
    private String apellido;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "correo", length = 50, nullable = false )
    private String correo;

    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "id_Rol")
    private Rol rol;
}
