package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		
		//MOCK --> Mockito
		RepositorioDeAlunosMemoria repositorio = new RepositorioDeAlunosMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados = new MatricularAlunoDto("FIlipe cajado", "188.989.789-85", "filipe@cajado.com.bt");
		useCase.executa(dados );
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("188.989.789-85"));
		
		assertEquals("FIlipe cajado", encontrado.getNome());
		assertEquals("188.989.789-85", encontrado.getCpf());
		assertEquals("filipe@cajado.com.bt", encontrado.getEmail());
	}

}
