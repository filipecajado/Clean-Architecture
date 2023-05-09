package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void numeroDddInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone(null, "9999-9999"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("", "9999-9999"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("1111", "9999-9999"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("1", "9999-9999"));
	}
	
	@Test
	void numeroNumeroInvalido() {
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("12", null));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("12", ""));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("12", "9999-99995"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("12", "999-9999"));
		assertThrows(IllegalArgumentException.class,
				() -> new Telefone("12", "9999999"));
	}

	@Test
	void deveriaCriarTElefoneComNumeroEDDDValidos() {
		Telefone telefone = new Telefone("32", "9999-9999");
		
		assertEquals("32", telefone.getDdd());
		assertEquals("9999-9999", telefone.getNumero());
	}
}
