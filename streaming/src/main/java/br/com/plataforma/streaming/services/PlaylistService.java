package br.com.plataforma.streaming.services;

import br.com.plataforma.streaming.entities.Playlist;
import br.com.plataforma.streaming.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository playlistRepository;

    public List<Playlist> listarPlaylists() {
        return playlistRepository.findAll();
    }

    public Playlist salvarPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }
}
