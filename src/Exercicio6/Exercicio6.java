package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		final int number;
		final int tercaParte;
		System.out.println("Digite um valor para descobrir sua terça parte");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		tercaParte = number / 3;
		System.out.format(" O numero %d e a terça parte do valor é %d", number, tercaParte);
		scan.close();
	}
}
