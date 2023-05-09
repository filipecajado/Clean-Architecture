package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.CPF;

class CPFTest {


	@Test
	void naoCriarCPFInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new CPF( "111.111.111-112"));
		assertThrows(IllegalArgumentException.class,
				() -> new CPF( null));
		assertThrows(IllegalArgumentException.class,
				() -> new CPF( ""));	
	}
	
	void deveriaCriarCPFValido() {
		CPF cpf = new CPF("111.111.111-11");
		
		assertEquals("111.111.111-11", cpf.getNumero());
	}
 
}
