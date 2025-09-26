package br.com.plataforma.streaming.repositories;

import br.com.plataforma.streaming.entities.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
