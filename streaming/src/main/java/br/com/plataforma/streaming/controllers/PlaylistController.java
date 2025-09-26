package br.com.plataforma.streaming.controllers;

import br.com.plataforma.streaming.entities.Playlist;
import br.com.plataforma.streaming.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    @GetMapping
    public List<Playlist> listarPlaylists() {
        return playlistService.listarPlaylists();
    }

    @PostMapping
    public Playlist salvarPlaylist(@RequestBody Playlist playlist) {
        return playlistService.salvarPlaylist(playlist);
    }

    @DeleteMapping("/{id}")
    public void deletarPlaylist(@PathVariable Long id) {
        playlistService.deletarPlaylist(id);
    }

    @PutMapping("/{id}")
    public Playlist atualizarPlaylist(@PathVariable Long id, @RequestBody Playlist playlist) {
        return playlistService.atualizarPlaylist(id, playlist);
    }

}
