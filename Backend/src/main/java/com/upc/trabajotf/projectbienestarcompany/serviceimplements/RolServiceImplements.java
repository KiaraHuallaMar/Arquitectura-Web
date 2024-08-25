package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Rol;
import com.upc.trabajotf.projectbienestarcompany.repositories.RolRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.RolServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplements implements RolServiceInterfaces {
    @Autowired
    private RolRepository rolRepository;
    @Override
    public List<Rol> listar() {return rolRepository.findAll();}
}
