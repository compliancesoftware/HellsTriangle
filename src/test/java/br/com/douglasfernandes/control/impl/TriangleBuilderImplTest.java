package br.com.douglasfernandes.control.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.douglasfernandes.control.TriangleBuilder;
import br.com.douglasfernandes.model.Side;
import br.com.douglasfernandes.model.Triangle;
import br.com.douglasfernandes.util.ArrayUtils;

public class TriangleBuilderImplTest {

	@Test
	public void testBuildIntegerArrayArray() {
		Integer[][] triangulo = new Integer[][]{{6},{3,5},{9,7,1},{4,6,8,4}};
		
		Triangle trianguloDesejado = new Triangle();
		trianguloDesejado.setLinhas(ArrayUtils.arrayToList(triangulo));
		
		TriangleBuilder builder = new TriangleBuilderImpl();
		Triangle trianguloConstruido = builder.build(triangulo);
		
		assertEquals(trianguloDesejado, trianguloConstruido);
	}

	@Test
	public void testBuildListOfListOfInteger() {
		List<List<Integer>> triangulo = ArrayUtils.arrayToList(new Integer[][]{{6},{3,5},{9,7,1},{4,6,8,4}});
		
		Triangle trianguloDesejado = new Triangle();
		trianguloDesejado.setLinhas(triangulo);
		
		TriangleBuilder builder = new TriangleBuilderImpl();
		Triangle trianguloConstruido = builder.build(triangulo);
		
		assertEquals(trianguloDesejado, trianguloConstruido);
	}

	@Test
	public void testReduceRight() {
		List<List<Integer>> triangulo = ArrayUtils.arrayToList(new Integer[][]{{6},{3,5},{9,7,1},{4,6,8,4}});
		List<List<Integer>> trianguloReduzido = ArrayUtils.arrayToList(new Integer[][]{{5},{7,1},{6,8,4}});
		
		TriangleBuilder builder = new TriangleBuilderImpl();
		
		Triangle trianguloReduzidoDesejado = builder.build(trianguloReduzido);
		
		Triangle trianguloConstruido = builder.build(triangulo);
		trianguloConstruido = builder.reduce(trianguloConstruido, Side.RIGHT);
		
		assertEquals(trianguloReduzidoDesejado, trianguloConstruido);
	}

	@Test
	public void testReduceLeft() {
		List<List<Integer>> triangulo = ArrayUtils.arrayToList(new Integer[][]{{6},{3,5},{9,7,1},{4,6,8,4}});
		List<List<Integer>> trianguloReduzido = ArrayUtils.arrayToList(new Integer[][]{{3},{9,7},{4,6,8}});
		
		TriangleBuilder builder = new TriangleBuilderImpl();
		
		Triangle trianguloReduzidoDesejado = builder.build(trianguloReduzido);
		
		Triangle trianguloConstruido = builder.build(triangulo);
		trianguloConstruido = builder.reduce(trianguloConstruido, Side.LEFT);
		
		assertEquals(trianguloReduzidoDesejado, trianguloConstruido);
	}
}
