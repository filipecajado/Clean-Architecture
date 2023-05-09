package br.com.alura.escola.dominio.aluno;

public interface CifradorDeSenha {
	
	String cifrarSenha (String senha);
	
	boolean validaSenhaCifrada(String senhaCifrada, String senha);
	
}
