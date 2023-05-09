package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	public void naoDeveriaCriarEmailsComNomeInvalidos() {
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailinvalido"));
	}
	
	@Test
	public void deveriaCriarEmailsComNomevalido() {
		Email mail = new Email("filipe@como.com");
		 
		assertEquals("filipe@como.com", mail.getEndereco());
	}
	

}
