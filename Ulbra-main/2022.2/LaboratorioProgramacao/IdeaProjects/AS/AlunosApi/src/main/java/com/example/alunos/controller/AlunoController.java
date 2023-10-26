package com.example.alunos.controller;

import com.example.alunos.model.Aluno;
import com.example.alunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController //permite definir um controller com características REST
@RequestMapping("/api") //permite definir uma rota.
public class AlunoController {

    @Autowired /*A anotação @ Autowired fornece controle sobre onde e como a ligação entre os beans deve ser realizada.
    Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e / ou vários argumentos.
    */

    AlunoRepository alunoRepository;
    //Recuperar todos os alunos
    @GetMapping("/alunos")
    public List<Aluno> getAllNotes(){
        return alunoRepository.findAll();
    }

    @GetMapping("/alunos/{id}")
    public Optional<Aluno> getById(@PathVariable(value = "id") Long id){
        return alunoRepository.findById(id);
    }

    @DeleteMapping("/alunos/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id){
        Optional<Aluno> aluno = alunoRepository.findById(id);
        alunoRepository.delete(aluno.get());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/alunos/{id}")
    public Aluno updateNote(@PathVariable(value = "id") Long id,
                            @Valid @RequestBody Aluno alunoDetails){
        Optional<Aluno> aluno = alunoRepository.findById(id);
        aluno.get().setNome(alunoDetails.getNome());
        aluno.get().setTurma(alunoDetails.getTurma());
        Aluno alunoResponse = alunoRepository.save(aluno.get());
        return alunoResponse;
    }


    @PostMapping("/alunos")
    public Aluno createNote(@Valid @RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

}
