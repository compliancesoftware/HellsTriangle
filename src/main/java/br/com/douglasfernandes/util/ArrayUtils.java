package br.com.douglasfernandes.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import br.com.douglasfernandes.exceptions.EntradaInvalidaException;

/**
 * Auxilia a converter Arrays em Listas
 * @author douglas.f.filho
 *
 */
public class ArrayUtils {
	
	public static <T> List<List<T>> arrayToList(T[][] array) {
		List<List<T>> list = null;
		
		if(array != null && array.length > 0) {
			list = new ArrayList<List<T>>();
			for(T[] item : array) {
				List<T> subList = new ArrayList<T>();
				
				for(T subItem : item) {
					subList.add(subItem);
				}
				
				list.add(subList);
			}
		}
		
		return list;
	}
	
	public static Integer[][] stringToIntegerArray(String arrayAsText) throws EntradaInvalidaException {
		if(arrayAsText != null && 
				!arrayAsText.equals("") && 
				arrayAsText.length() >= 5 && 
				arrayAsText.contains("[") && 
				arrayAsText.contains("]")) {
			
			arrayAsText = arrayAsText.substring(1, arrayAsText.length() - 1);
			
			String[] linhas = arrayAsText.split(Pattern.quote(",["));
			
			Integer[][] lista = new Integer[linhas.length][];
			
			for(int i = 0;i < linhas.length;i++) {
				String linha = linhas[i];
				linha = linha.replace("[", "").replace("]", "");
				
				String[] conteudoDaLinha = linha.split(Pattern.quote(","));
				
				lista[i] = new Integer[conteudoDaLinha.length];
				
				for(int j = 0;j < conteudoDaLinha.length;j++) {
					lista[i][j] = Integer.parseInt(conteudoDaLinha[j]);
				}
			}
			
			return lista;
		}
		else {
			throw new EntradaInvalidaException();
		}
	}
	
}