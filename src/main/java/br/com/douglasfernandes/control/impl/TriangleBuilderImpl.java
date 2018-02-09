package br.com.douglasfernandes.control.impl;

import java.util.List;

import br.com.douglasfernandes.control.TriangleBuilder;
import br.com.douglasfernandes.model.Side;
import br.com.douglasfernandes.model.Triangle;
import br.com.douglasfernandes.util.ArrayUtils;

/**
 * Construtor de triangulos
 * @author douglas.f.filho
 *
 */
public class TriangleBuilderImpl implements TriangleBuilder{

	@Override
	public Triangle build(Integer[][] linhas) {
		List<List<Integer>> lines = ArrayUtils.arrayToList(linhas);
		return this.build(lines);
	}
	
	@Override
	public Triangle build(List<List<Integer>> linhas) {
		Triangle triangle = new Triangle();
		triangle.setLinhas(linhas);
		return triangle;
	}
	
	@Override
	public Triangle reduce(Triangle triangle, Side side) {
		if(triangle.size() > 1) {
			List<List<Integer>> linhas = triangle.getLinhas();
			linhas.remove(0);
			Triangle newTriangle = null;
			
			if(side == Side.LEFT) {
				for(List<Integer> linha : linhas) {
					linha.remove(linha.size() - 1);
				}
			}
			else {
				for(List<Integer> linha : linhas) {
					linha.remove(0);
				}
			}
			
			newTriangle = this.build(linhas);
			
			return newTriangle;
		}
		else {
			return triangle;
		}
	}
}
