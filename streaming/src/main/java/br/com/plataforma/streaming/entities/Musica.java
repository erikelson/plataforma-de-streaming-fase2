package br.com.plataforma.streaming.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "musicas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String artista;
    @Column(nullable = false)
    private Integer duracaoEmSegundos;

    @ManyToMany(mappedBy = "musicas")
    @JsonIgnore
    private List<Playlist> playlists = new ArrayList<Playlist>();

}
