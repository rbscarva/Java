package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		
		// vari�veis
		double alcool, gasolina;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora FLEX");
		
		// entrada
		System.out.print("Digite o valor do �lcool: ");
		alcool = teclado.nextDouble();
		
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		
		// processamento / sa�da
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abaste�a com �lcool");
		} else {
			System.out.println("Abaste�a com Gasolina");
		}

	}
}
