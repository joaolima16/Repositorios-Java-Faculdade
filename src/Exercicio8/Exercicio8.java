package Exercicio8;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double salario, novoSalario,reajusteSalario;
		System.out.println("Digite um saldo para obter reajuste de 1%");
		salario = scan.nextDouble();
		reajusteSalario = salario * 0.1;
		novoSalario = salario + reajusteSalario;
		System.out.format("O salário %5.0f sofreu um reajuste e agora está: %5.0f", salario, novoSalario);
		scan.close();
	}
}
