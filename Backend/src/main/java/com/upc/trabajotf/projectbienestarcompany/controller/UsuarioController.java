package com.upc.trabajotf.projectbienestarcompany.controller;

import com.upc.trabajotf.projectbienestarcompany.dtos.RolDTO;
import com.upc.trabajotf.projectbienestarcompany.dtos.UsuarioDTO;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.TratamientoServiceInterfaces;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.UsuarioServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceInterfaces usuarioServiceInterfaces;

    @GetMapping
    public List<UsuarioDTO> obtenerUsuarios(){

        return usuarioServiceInterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
}
