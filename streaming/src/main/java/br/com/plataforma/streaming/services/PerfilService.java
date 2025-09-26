package br.com.plataforma.streaming.services;

import br.com.plataforma.streaming.entities.Perfil;
import br.com.plataforma.streaming.repositories.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;

    public List<Perfil> listarPerfis() {
        return perfilRepository.findAll();
    }

    public Perfil salvarPerfil(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    public Perfil atualizarPerfil(Long id, Perfil perfilAtualizado) {
        return perfilRepository.findById(id).map(perfil -> {
            perfil.setBiografia(perfilAtualizado.getBiografia());
            perfil.setImagemUrl(perfilAtualizado.getImagemUrl());
            perfil.setUsuario(perfilAtualizado.getUsuario());
            return perfilRepository.save(perfil);
        }).orElseThrow(() -> new RuntimeException("Perfil não encontrado com id: " + id));
    }
}
