package spring.api.minha.Aluno;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "alunos")
public class Aluno {

    public Aluno(cadastraAlunoDTO cadastroDTO){
        this.nomeAluno = cadastroDTO.nomeAluno();
        this.idadeAluno = cadastroDTO.idadeAluno();
    }
    @Getter
    @Setter
    @Id
    private long idAluno;
    @Getter
    @Setter
    private String nomeAluno;
    @Getter
    @Setter
    private int idadeAluno;
}
