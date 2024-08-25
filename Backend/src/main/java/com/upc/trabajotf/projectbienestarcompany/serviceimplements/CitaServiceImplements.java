package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Cita;
import com.upc.trabajotf.projectbienestarcompany.repositories.CitaRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.CitaServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImplements implements CitaServiceInterfaces {
    @Autowired
    private CitaRepository citaRepository;
    @Override
    //Listar Cita
    public List<Cita> listar() {return citaRepository.findAll();}
    //Registrar Cita
    public Cita registrar(Cita cita) {return citaRepository.save(cita);}
}
