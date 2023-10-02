package spring.api.minha.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import spring.api.minha.Aluno.Aluno;
import spring.api.minha.Aluno.AlunoRepository;
import spring.api.minha.Aluno.cadastraAlunoDTO;

@RestController
@RequestMapping
public class AlunoController {

    @Autowired // Use esta anotação para injetar o AlunoRepository automaticamente
    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
    private AlunoRepository alunoRepository;

    public void cadastrar(@RequestBody cadastraAlunoDTO cadastroDTO){
        alunoRepository.save(new Aluno(cadastroDTO));
    }
}

//1-record DadosCadastroMedico
//2-E feito um metodo construtor que recebe um objeto do tipo dados
//3-O metodo cadastrar recebe um objeto do tipo DadosCadastroMedico
//4-E o metodo construtor Medico recebe o objeto dados


