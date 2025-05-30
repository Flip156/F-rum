package com.nataliatsi.api.forumhub.domain.topico;

import com.nataliatsi.api.forumhub.domain.autor.Autor;
import com.nataliatsi.api.forumhub.domain.curso.Curso;
import com.nataliatsi.api.forumhub.domain.resposta.Resposta;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,

        LocalDateTime dataCriacao,
        @NotBlank
        String status,
        @NotNull
        @Valid
        Autor autor,
        @NotNull
        @Valid
        Curso curso
 ) {
}
