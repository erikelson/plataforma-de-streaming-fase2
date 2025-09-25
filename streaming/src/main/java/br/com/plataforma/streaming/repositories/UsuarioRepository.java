package br.com.plataforma.streaming.repositories;

import br.com.plataforma.streaming.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
