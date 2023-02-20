package Exercicio10;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		double base, altura;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base do retângulo");
		base = scan.nextDouble();
		System.out.println("Digite a altura do retângulo");
		altura = scan.nextDouble();
		
		if (base < 0 || altura < 0) {
			System.out.println("Algum valor foi digitado incorretamente");
		} 
		else {
			Retangulo retangulo = new Retangulo(base, altura);
			retangulo.Perimetro();
			retangulo.Area();
			scan.close();
		}

	}
}
