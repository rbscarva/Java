package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// a linha abaixo cria vari�veis num�ricas de precis�o
		// float e double s�o tipos primitivos num�ricos reais(casas decimais)
		double peso, altura, imc;
		Scanner teclado = new Scanner(System.in);
		System.out.println("========= C�lculo do IMC =========");
		System.out.print("Digite o seu peso em kg: ");
		//entrada
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		altura = teclado.nextDouble();
		//processamento
		imc = peso / (altura * altura);
		//sa�da
		System.out.println("IMC: " + imc);
	}

}
