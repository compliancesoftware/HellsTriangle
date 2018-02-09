package br.com.douglasfernandes.control;

import java.util.List;

import br.com.douglasfernandes.model.Side;
import br.com.douglasfernandes.model.Triangle;

/**
 * Definição do construtor de triangulos.
 * @author douglas.f.filho
 *
 */
public interface TriangleBuilder {
	/**
	 * Método de construção.
	 * @param linhas
	 * @return
	 */
	public Triangle build(Integer[][] linhas);
	
	/**
	 * Método de construção.
	 * @param linhas
	 * @return
	 */
	public Triangle build(List<List<Integer>> linhas);
	
	/**
	 * Obter triangulo reduzido com base no lado de redução.
	 * @param triangle = Triangulo a ser reduzido
	 * @param side = lado de redução
	 * @return
	 */
	public Triangle reduce(Triangle triangle, Side side);
}
