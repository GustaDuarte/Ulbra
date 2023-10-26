package com.example.alunos.repository;

import com.example.alunos.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository //Temos que um repositório implementa parte das regras de negócio no que se refere à composição das entidades.
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
