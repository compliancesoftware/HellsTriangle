package br.com.douglasfernandes.view;

/**
 * Defini��o de um receptor e tratador de dados de entrada.
 * @author douglas.f.filho
 *
 */
public interface View {
	/**
	 * M�todo usado para executar a aplica��o.
	 */
	public void run();
	
	/**
	 * M�todo usado para solicitar a entrada do usu�rio.
	 */
	public void requestInput();
	
	/**
	 * M�todo usado para exibir a sa�da ap�s tratamento.
	 */
	public void showOutput();
}
