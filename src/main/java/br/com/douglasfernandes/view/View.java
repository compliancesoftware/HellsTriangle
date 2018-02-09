package br.com.douglasfernandes.view;

/**
 * Definição de um receptor e tratador de dados de entrada.
 * @author douglas.f.filho
 *
 */
public interface View {
	/**
	 * Método usado para executar a aplicação.
	 */
	public void run();
	
	/**
	 * Método usado para solicitar a entrada do usuário.
	 */
	public void requestInput();
	
	/**
	 * Método usado para exibir a saída após tratamento.
	 */
	public void showOutput();
}
