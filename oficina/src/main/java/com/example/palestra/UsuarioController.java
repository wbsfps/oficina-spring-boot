package com.example.palestra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("usuario")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.create(usuario);
    }
    @PutMapping("/{id}")
    public Usuario update(@PathVariable(name = "id") Long id, @RequestBody Usuario usuario) {
        return usuarioService.update(id, usuario);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        usuarioService.delete(id);
    }
}
