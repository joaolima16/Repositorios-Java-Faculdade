package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		
		System.out.println("Seja bem vindo: " + nome);
		scan.close();
	}
	
}
