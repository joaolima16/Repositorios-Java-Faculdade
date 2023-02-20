package Exercicio11;

import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		double base, altura;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base do Triangulo");
		base = scan.nextDouble();
		System.out.println("Digite a altura do Triangulo");
		altura = scan.nextDouble();
		
		if (base < 0 || altura < 0) {
			System.out.println("Algum valor foi digitado incorretamente");
		} 
		else {
			Triangulo triangulo = new Triangulo(base,altura);
			triangulo.Area();
			scan.close();
		}
	}
}
