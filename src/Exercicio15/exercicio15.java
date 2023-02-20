package Exercicio15;

import java.util.Scanner;

public class exercicio15 {
	public static void main(String[] args) {
		double Valor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor gasto no restaurante");
		Valor = scan.nextDouble();
		if( Valor <=0) {
			System.out.println("Algum valor foi digitado incorretamente! ");
		}
		else {
			Restaurante conta = new Restaurante(Valor);
			conta.ValorFinal();
		}
		
	}
}
