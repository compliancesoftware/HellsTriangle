package br.com.douglasfernandes.view.impl;

import java.util.Scanner;

import br.com.douglasfernandes.control.Tracker;
import br.com.douglasfernandes.control.TriangleBuilder;
import br.com.douglasfernandes.control.impl.TrackerImpl;
import br.com.douglasfernandes.control.impl.TriangleBuilderImpl;
import br.com.douglasfernandes.model.Triangle;
import br.com.douglasfernandes.util.ArrayUtils;
import br.com.douglasfernandes.view.View;

/**
 * Aplicação executada via console
 * @author douglas.f.filho
 *
 */
public class ConsoleView implements View {

	private Integer[][] linhas;
	private Triangle triangle;
	
	@Override
	public void run() {
		this.requestInput();
		
		TriangleBuilder builder = new TriangleBuilderImpl();
		triangle = builder.build(linhas);
		
		this.showOutput();
	}

	private void getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		try {
			this.linhas = ArrayUtils.stringToIntegerArray(input);
		} catch(RuntimeException e) {
			System.out.println("Erro ao tentar obter entrada de dados: " + e.getMessage());
		}
	}
	
	@Override
	public void requestInput() {
		System.out.println("Por favor, defina o seu triangulo:");
		getInput();
	}

	@Override
	public void showOutput() {
		try {
			Tracker tracker = new TrackerImpl();
			int soma = tracker.soma(this.triangle);
			System.out.println("Resultado da soma: " + soma);
		} catch(RuntimeException e) {
			System.out.println("Erro no processo de soma: " + e.getMessage());
		}
	}

}
