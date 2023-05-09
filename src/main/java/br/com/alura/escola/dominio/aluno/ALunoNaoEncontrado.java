package br.com.alura.escola.dominio.aluno;

public class ALunoNaoEncontrado extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ALunoNaoEncontrado(CPF cpf) {
		super("Aluno nao encontrado com CPF: " + cpf.getNumero());
	}
}
