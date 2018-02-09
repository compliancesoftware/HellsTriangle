package br.com.douglasfernandes.control;

import java.util.List;

import br.com.douglasfernandes.model.Side;
import br.com.douglasfernandes.model.Triangle;

/**
 * Defini��o do construtor de triangulos.
 * @author douglas.f.filho
 *
 */
public interface TriangleBuilder {
	/**
	 * M�todo de constru��o.
	 * @param linhas
	 * @return
	 */
	public Triangle build(Integer[][] linhas);
	
	/**
	 * M�todo de constru��o.
	 * @param linhas
	 * @return
	 */
	public Triangle build(List<List<Integer>> linhas);
	
	/**
	 * Obter triangulo reduzido com base no lado de redu��o.
	 * @param triangle = Triangulo a ser reduzido
	 * @param side = lado de redu��o
	 * @return
	 */
	public Triangle reduce(Triangle triangle, Side side);
}
