package br.com.plataforma.streaming.repositories;

import br.com.plataforma.streaming.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
