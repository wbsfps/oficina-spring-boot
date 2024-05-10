package com.example.palestra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario create(Usuario usuairo) {
        return usuarioRepository.save(usuairo);
    }
    public Usuario usuario(Usuario usuario) {
        usuarioRepository.findById(usuario.getId());
        return usuarioRepository.save(usuario);
    }
    public Usuario update(Long id, Usuario usuario) {
        usuarioRepository.findById(id);
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
