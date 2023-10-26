/*Crie uma API REST FULL para gestão de alunos utilizando:
		• SpringBoot
		• MySQL
		• JPA
		• Hibernate
		A API deverá fazer um CRUD da entidade alunos, que deverá possuir as seguintes
		propriedades, Id(numérico), Nome(Texto), Turma(Texto).
		Enviar o código e o vídeo explicando seu funcionamento.
*/
package com.example.alunos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
/*Para que serve o JPA Repository?
Ao herdar a interface JpaRepository, dois propósitos são preenchidos: no primeiro, uma variedade de métodos como save(), delete(), findAll(), entre outros, são fornecidos;
e no segundo, o reconhecimento desta interface como um bean do Spring, o que é útil para a injeção de dependência.
*/
public class AlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunosApplication.class, args);
	}

}
