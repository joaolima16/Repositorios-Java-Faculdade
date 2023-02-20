package Exercicio14;

import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
		int varA,varB,varC;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da variável A");
		varA = scan.nextInt();
		System.out.println("Digite o valor da variável B");
		varB = scan.nextInt();
		varC = varA;
		varA = varB;
		varB = varC;
		System.out.format("A variável A passou a ter o valor: %d \n",varA);
		System.out.format("A variável B passou a ter o valor: %d", varB);
	}
}
