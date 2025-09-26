package br.com.plataforma.streaming.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "perfis")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String biografia;
    @Column(nullable = false)
    private String imagemUrl;
    @OneToOne
    @JoinColumn(name = "usuarios_id", unique = true)
    private Usuario usuario;


}
