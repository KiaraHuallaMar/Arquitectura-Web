package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Tratamiento;
import com.upc.trabajotf.projectbienestarcompany.repositories.TratamientoRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.TratamientoServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TratamientoServiceImplements implements TratamientoServiceInterfaces {
    @Autowired
    private TratamientoRepository tratamientoRepository;
    @Override
    public List<Tratamiento> listar() {return tratamientoRepository.findAll();}
}
