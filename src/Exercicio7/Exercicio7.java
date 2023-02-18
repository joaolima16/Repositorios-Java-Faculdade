package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int numberUm,numberDois, numberTres, numberQuatro, resultado;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quatro numeros para descobrir a média ponderada");
		numberUm = scan.nextInt();
		numberDois = scan.nextInt();
		numberTres = scan.nextInt();
		numberQuatro = scan.nextInt();
		resultado = (numberUm * 1 + numberDois * 2 + numberTres * 3 + numberQuatro * 4) /10;
		System.out.println("O resultado da média ponderada dos valores digitados: " + resultado);
		scan.close();
	}
}
