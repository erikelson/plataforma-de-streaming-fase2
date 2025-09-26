package br.com.plataforma.streaming.controllers;

import br.com.plataforma.streaming.entities.Perfil;
import br.com.plataforma.streaming.services.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfis")
public class PerfilController {
    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<Perfil> listarPerfis() {
        return perfilService.listarPerfis();
    }

    @PostMapping
    public Perfil salvarPerfil(@RequestBody Perfil perfil) {
        return perfilService.salvarPerfil(perfil);
    }

    @PutMapping("/{id}")
    public Perfil atualizarPerfil(@PathVariable Long id, @RequestBody Perfil perfil) {
        return perfilService.atualizarPerfil(id, perfil);
    }

}
