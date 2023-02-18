package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		final int number;
		final int antecessor;
		final int sucessor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor para descobrir seu antecessor");
		number = scan.nextInt();
		antecessor = number - 1;
		sucessor = number + 1;
		System.out.format(" O valor %d tem o sucessor %d e o antecessor %d", number, sucessor, antecessor);
		scan.close();
	}
}
