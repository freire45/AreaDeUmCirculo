package br.com.erickfreire.areadeumcirculo;

import java.util.Scanner;

/**
 * Programa em Java que calcula a �rea de um c�rculo
 * @author Erick Freire
 * @version 1 - Criado em 01-05-2021 as 15:13
 */

public class AreaDeUmCirculo {

	public static void main(String[] args) {
		
		double raio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula a �rea de um c�rculo: ");
		
		System.out.print("Informe o raio do circulo : ");
		raio = entrada.nextDouble();
		
		calculaArea(raio);		

	}
	
	public static void calculaArea(double r) {
		double area = Math.PI * (Math.pow(r,2));
		
		System.out.printf("%n%nA �rea � de: %f%n", area);
	}

}
