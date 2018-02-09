package br.com.douglasfernandes;

import br.com.douglasfernandes.view.View;
import br.com.douglasfernandes.view.impl.ConsoleView;

/**
 * Classe principal da aplicação
 * @author douglas.f.filho
 *
 */
public class HellTriangle {

	/**
	 * Método principal de execução da aplicação
	 * @param args
	 */
	public static void main(String[] args) {
		View view = new ConsoleView();
		view.run();
	}
	
}
