package br.com.douglasfernandes.exceptions;

public class EntradaInvalidaException extends RuntimeException {

	/**
	 * Serial gerado automaticamente.
	 */
	private static final long serialVersionUID = 1L;

	public EntradaInvalidaException() {
		super("Entrada nula ou inválida");
	}
	
}
