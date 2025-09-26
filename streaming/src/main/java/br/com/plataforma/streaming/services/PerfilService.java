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



}
