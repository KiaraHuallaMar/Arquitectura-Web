package com.upc.trabajotf.projectbienestarcompany.serviceinterfaces;

import com.upc.trabajotf.projectbienestarcompany.entities.Cita;

import java.util.List;

public interface CitaServiceInterfaces {
    //Listar Cita
    public List<Cita> listar();
    //Registrar Cita
    public Cita registrar (Cita cita);
}
