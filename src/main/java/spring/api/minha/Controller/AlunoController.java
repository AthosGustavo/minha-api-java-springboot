package spring.api.minha.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.api.minha.Aluno.Aluno;
import spring.api.minha.Aluno.AlunoRepository;
import spring.api.minha.Aluno.DadosAtualizaAluno;
import spring.api.minha.Aluno.cadastraAlunoDTO;

import java.util.List;

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

    @GetMapping
    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }

    @PutMapping
    public void atualizar(@RequestBody DadosAtualizaAluno dados){
        var aluno = alunoRepository.getReferenceById(dados.idAluno());
        aluno.atualizarInfo(dados);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        alunoRepository.deleteById(id);
    }

    //exclusao logica



}

//1-record DadosCadastroMedico
//2-E feito um metodo construtor que recebe um objeto do tipo dados
//3-O metodo cadastrar recebe um objeto do tipo DadosCadastroMedico
//4-E o metodo construtor Medico recebe o objeto dados


