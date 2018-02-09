package br.com.douglasfernandes.control;

import br.com.douglasfernandes.exceptions.EntradaInvalidaException;
import br.com.douglasfernandes.model.Triangle;

/**
 * Responsável por identificar a regra que será aplicada ao triangulo e resolve-la
 * @author douglas.f.filho
 *
 */
public interface Tracker {
	/**
	 * Método para somar valores do triangulo.
	 * @param triangle
	 * @return
	 */
	public int soma(Triangle triangle) throws EntradaInvalidaException;
}
