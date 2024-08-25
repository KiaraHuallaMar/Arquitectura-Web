package com.upc.trabajotf.projectbienestarcompany.controller;

import com.upc.trabajotf.projectbienestarcompany.dtos.RolDTO;
import com.upc.trabajotf.projectbienestarcompany.dtos.TratamientoDTO;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.TratamientoServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tratamiento")
public class TratamientoController {

    @Autowired
    private TratamientoServiceInterfaces tratamientoServiceInterfaces;

    @GetMapping
    public List<TratamientoDTO> obtenerTratamientos(){

        return tratamientoServiceInterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TratamientoDTO.class);
        }).collect(Collectors.toList());
    }
}
