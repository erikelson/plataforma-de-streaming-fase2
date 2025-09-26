# ⚙️ PROJETO FASE 2 - Plataforma de Streaming 🎵
Este é um projeto de uma API REST para uma **plataforma de streaming de músicas**, desenvolvido com **Java**, **Spring Boot** e **JPA/Hibernate**. A aplicação permite o gerenciamento de usuários, perfis, músicas e playlists.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (pode ser substituída por outra)
- Lombok
- Jackson (para serialização JSON)
- Postman (para testes de API)

## 🗂️ Estrutura de Entidades

### `Usuario`
- `id`, `nome`, `email`
- Relacionamento: 1:1 com `Perfil`, 1:N com `Playlist`

### `Perfil`
- `id`, `biografia`, `imagemUrl`
- Relacionamento: 1:1 com `Usuario`

### `Playlist`
- `id`, `nomePlaylist`
- Relacionamento: N:1 com `Usuario`, N:N com `Musica`

### `Musica`
- `id`, `titulo`, `artista`, `duracaoEmSegundos`
- Relacionamento: N:N com `Playlist`

---

## 🧪 Como Testar a API

### 📦 Importar a coleção no Postman

1. Instale o [Postman](https://www.postman.com/downloads/)
2. Importe a coleção `plataforma streaming.postman_collection.json` incluída neste repositório.
3. Certifique-se de que a API está rodando localmente em `http://localhost:8080`.
4. Use os endpoints já configurados na coleção para testar os recursos:

| Recurso     | Método | Endpoint                  | Descrição                     |
|-------------|--------|---------------------------|-------------------------------|
| Usuários    | GET    | `/usuarios`               | Listar todos os usuários      |
| Usuários    | POST   | `/usuarios`               | Criar um novo usuário         |
| Usuários    | DELETE | `/usuarios/{id}`          | Deletar usuário               |
| Perfis      | GET    | `/perfis`                 | Listar todos os perfis        |
| Perfis      | POST   | `/perfis`                 | Criar um novo perfil          |
| Perfis      | PUT    | `/perfis/{id}`            | Atualizar perfil              |
| Músicas     | GET    | `/musicas`                | Listar todas as músicas       |
| Músicas     | POST   | `/musicas`                | Adicionar nova música         |
| Músicas     | DELETE | `/musicas/{id}`           | Deletar música                |
| Playlists   | GET    | `/playlists`              | Listar todas as playlists     |
| Playlists   | POST   | `/playlists`              | Criar playlist com músicas    |
| Playlists   | PUT    | `/playlists/{id}`         | Atualizar playlist            |
| Playlists   | DELETE | `/playlists/{id}`         | Deletar playlist              |

---

## ⚙️ Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/plataforma-streaming.git
cd plataforma-streaming
```

2. Abra o projeto em sua IDE (IntelliJ, Eclipse, VSCode)

Certifique-se de que o Lombok está instalado e ativado na sua IDE.

Execute a aplicação pela classe principal:
```bash
br.com.plataforma.streaming.PlataformaStreamingApplication
```

3. Acesse a API no navegador ou pelo Postman:
```bash
http://localhost:8080
```



