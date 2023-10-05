package spring.api.minha.Aluno;

import org.antlr.v4.runtime.misc.NotNull;

public record DadosAtualizaAluno(
        @NotNull
        Long idAluno,
        String nomeAluno,
        int idadeAluno) {
//NotNull -> nao pode ser vazio para int
    //NotBlank -> nao pode ser vazio para String


}
