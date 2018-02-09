package br.com.douglasfernandes;

import br.com.douglasfernandes.view.View;
import br.com.douglasfernandes.view.impl.ConsoleView;

/**
 * Classe principal da aplica��o
 * @author douglas.f.filho
 *
 */
public class HellTriangle {

	/**
	 * M�todo principal de execu��o da aplica��o
	 * @param args
	 */
	public static void main(String[] args) {
		View view = new ConsoleView();
		view.run();
	}
	
}
