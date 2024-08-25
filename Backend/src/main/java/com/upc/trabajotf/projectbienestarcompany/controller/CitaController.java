package com.upc.trabajotf.projectbienestarcompany.controller;

import com.upc.trabajotf.projectbienestarcompany.dtos.CitaDTO;
import com.upc.trabajotf.projectbienestarcompany.entities.Cita;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.CitaServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cita")
public class CitaController {
    @Autowired
    private CitaServiceInterfaces citaServiceInterfaces;

    //Listar Cita
    @GetMapping
    public List<CitaDTO> obtenerListadoCitas(){

        return citaServiceInterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CitaDTO.class);
        }).collect(Collectors.toList());
    }
    //Registrar Cita
    @PostMapping("/registrar")
    public ResponseEntity<CitaDTO> registrar(@RequestBody CitaDTO citaDTO) {
        Cita cita;
        try {
            cita = convertToEntity(citaDTO);
            citaDTO = convertToDto(citaServiceInterfaces.registrar(cita));
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se pudo crear, lo siento", e);
        }
        return new ResponseEntity<CitaDTO>(citaDTO, HttpStatus.OK);
    }

    //OTROS
    private CitaDTO convertToDto(Cita cita) {
        ModelMapper modelMapper = new ModelMapper();
        CitaDTO citaDTO = modelMapper.map(cita, CitaDTO.class);
        return citaDTO;
    }

    private Cita convertToEntity(CitaDTO citaDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Cita post = modelMapper.map(citaDTO, Cita.class);
        return post;
    }

    private List<CitaDTO> convertToListDto(List<Cita> list){
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
}
