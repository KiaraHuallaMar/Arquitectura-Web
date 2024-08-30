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

    //Listar Usuario
    @Override
    public List<Usuario> listar() {return usuarioRepository.findAll();}

    //Registrar Usuario
    @Override
    public Usuario registrar(Usuario usuario) {return usuarioRepository.save(usuario);}

    //Listar por Id Usuario
    @Override
    public Usuario listarId(int id) {
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    //Actualizar Usuario
    @Override
    public void actualizar(Usuario usuario) {usuarioRepository.save(usuario); }

    //Eliminar Usuario
    @Override
    public void eliminar(int id) {
        usuarioRepository.deleteById(id);
    }
}
