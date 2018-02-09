package br.com.douglasfernandes.control.impl;

import java.util.List;

import br.com.douglasfernandes.control.Tracker;
import br.com.douglasfernandes.control.TriangleBuilder;
import br.com.douglasfernandes.exceptions.EntradaInvalidaException;
import br.com.douglasfernandes.model.Side;
import br.com.douglasfernandes.model.Triangle;

/**
 * Somador de valores seguindo a regra do lado de maior valor.
 * @author douglas.f.filho
 *
 */
public class TrackerImpl implements Tracker {

	@Override
	public int soma(Triangle triangle) throws EntradaInvalidaException {
		if(triangle != null && triangle.size() > 0) {
			try {
				int soma = 0;
				
				TriangleBuilder builder = new TriangleBuilderImpl();
				List<Integer> segundaLinha = null;
				while(triangle.size() > 0) {
					soma += triangle.getTop();
					if(triangle.size() > 1) {
						segundaLinha= triangle.secondLine();
						if(segundaLinha.get(0) > segundaLinha.get(1)) {
							triangle = builder.reduce(triangle, Side.LEFT);
						}
						else {
							triangle = builder.reduce(triangle, Side.RIGHT);
						}
					}
					else {
						break;
					}
				}
				
				return soma;
			} catch(Exception e) {
				throw new EntradaInvalidaException();
			}
		}
		else {
			throw new EntradaInvalidaException();
		}
	}

}
