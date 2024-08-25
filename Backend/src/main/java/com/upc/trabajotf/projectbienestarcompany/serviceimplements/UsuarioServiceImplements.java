package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Usuario;
import com.upc.trabajotf.projectbienestarcompany.repositories.UsuarioRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.UsuarioServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImplements implements UsuarioServiceInterfaces {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> listar() {return usuarioRepository.findAll();}
}
