package br.com.plataforma.streaming.repositories;

import br.com.plataforma.streaming.entities.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
