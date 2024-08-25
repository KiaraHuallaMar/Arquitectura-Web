package com.upc.practica1.projectbienestarcompany.dtos;

import com.upc.practica1.projectbienestarcompany.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TratamientoDTO {
    private int id;

    private String nombre;

    private String tipo_categoria;

    private String descripcion;

    private int pago;

    private Usuario usuario;
}
