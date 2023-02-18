package Exercicio3e4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		double numUm;
		double numDois;
		double numTres;
		final double media;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os valores para calcular a média aritmética");
		numUm = scan.nextDouble();
		numDois = scan.nextDouble();
		numTres = scan.nextDouble();
		media = (numUm + numDois + numTres) / 3;
		
		if(numUm <0 || numDois < 0 || numTres < 0) {
			System.out.println("Algum valor foi digitado incorretamente");
		}
		else {
			System.out.format("A média dos valores %5.1f, %5.1f  e %5.1f "+ " resultou em %5.1f %n",numUm, numDois, numTres, media);	
		}
		scan.close();
	}
}
