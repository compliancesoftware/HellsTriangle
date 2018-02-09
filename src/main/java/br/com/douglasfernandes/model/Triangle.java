package br.com.douglasfernandes.model;

import java.util.List;

/**
 * Objeto que representa um triangulo de inteiros
 * @author douglas.f.filho
 *
 */
public class Triangle {
	/**
	 * As linhas do triangulo.
	 */
	private List<List<Integer>> linhas;

	/**
	 * Obter as linhas do triangulo
	 * @return
	 */
	public List<List<Integer>> getLinhas() {
		return linhas;
	}

	/**
	 * Definir as linhas do triangulo
	 * @param linhas
	 */
	public void setLinhas(List<List<Integer>> linhas) {
		this.linhas = linhas;
	}
	
	/**
	 * Obter o inteiro do topo
	 * @return
	 */
	public int getTop() {
		if(linhas != null && linhas.size() > 0) {
			return linhas.get(0).get(0);
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Obter segunda linha do triangulo
	 * @return
	 */
	public List<Integer> secondLine() {
		if(linhas != null && linhas.size() > 0) {
			return linhas.get(1);
		}
		else {
			return null;
		}
	}
	
	public int size() {
		int size = 0;
		
		if(linhas != null) {
			size = linhas.size();
		}
		
		return size;
	}
	
	@Override
	public boolean equals(Object arg0) {
		boolean equals = true;
		
		if(arg0 instanceof Triangle) {
			Triangle outroTriangulo = (Triangle) arg0;
			
			if(outroTriangulo != null && outroTriangulo.size() > 0 && outroTriangulo.size() == this.size()) {
				for(int i = 0; i < this.linhas.size();i++) {
					List<Integer> linha = outroTriangulo.getLinhas().get(i);
					for(int j = 0;j < linha.size();j++) {
						if(!(linha.get(j).equals(this.linhas.get(i).get(j)))) {
							equals = false;
						}
					}
				}
			}
			else {
				equals = false;
			}
		}
		else {
			equals = false;
		}
		
		return equals;
	}
}
