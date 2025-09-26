package br.com.plataforma.streaming.services;

import br.com.plataforma.streaming.entities.Musica;
import br.com.plataforma.streaming.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository musicaRepository;

    public List<Musica> listaTodasMusicas(){
        return musicaRepository.findAll();
    }

    public Musica salvarMusica(Musica musica){
        return musicaRepository.save(musica);
    }
}
