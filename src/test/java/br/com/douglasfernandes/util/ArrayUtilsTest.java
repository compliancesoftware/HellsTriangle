package br.com.douglasfernandes.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void testArrayToList() {
		Integer[][] entrada = new Integer[][]{{6},{3,5},{9,7,1},{4,6,8,4}};
		List<List<Integer>> saida = ArrayUtils.arrayToList(entrada);
		
		List<List<Integer>> listaDesejada = new ArrayList<List<Integer>>();
		
		List<Integer> linha1 = new ArrayList<Integer>();
		linha1.add(6);
		listaDesejada.add(linha1);
		
		List<Integer> linha2 = new ArrayList<Integer>();
		linha2.add(3);
		linha2.add(5);
		listaDesejada.add(linha2);
		
		List<Integer> linha3 = new ArrayList<Integer>();
		linha3.add(9);
		linha3.add(7);
		linha3.add(1);
		listaDesejada.add(linha3);
		
		List<Integer> linha4 = new ArrayList<Integer>();
		linha4.add(4);
		linha4.add(6);
		linha4.add(8);
		linha4.add(4);
		listaDesejada.add(linha4);
		
		assertEquals(listaDesejada, saida);
	}

	@Test
	public void testStringToIntegerArray() {
		Integer[][] arrayDesejado = new Integer[][]{{6},{3,5},{9,7,1},{4,6,8,4}};
		
		String arrayAsText = "[[6],[3,5],[9,7,1],[4,6,8,4]]";
		Integer[][] convertido = ArrayUtils.stringToIntegerArray(arrayAsText);
		
		assertArrayEquals(arrayDesejado, convertido);
	}
}
