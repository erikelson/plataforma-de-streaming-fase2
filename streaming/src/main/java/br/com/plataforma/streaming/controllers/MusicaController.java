package br.com.plataforma.streaming.controllers;

import br.com.plataforma.streaming.entities.Musica;
import br.com.plataforma.streaming.repositories.MusicaRepository;
import br.com.plataforma.streaming.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
    @Autowired
    private MusicaService musicaService;

    @GetMapping
    public List<Musica> listarTodasMusicas(){
        return musicaService.listaTodasMusicas();
    }

    @PostMapping
    public Musica salvarMusica(@RequestBody Musica musica){
        return musicaService.salvarMusica(musica);
    }
}
