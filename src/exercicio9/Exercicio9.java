package exercicio9;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		double quilowattGasto, valorGasto, valorDesconto, desconto;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos quilowatts foram gastos na sua residência");
		quilowattGasto = scan.nextInt();
		valorGasto = (quilowattGasto * 1.73);
		desconto = (quilowattGasto * 10) / 100;
		valorDesconto = valorGasto - desconto;
		System.out.println(desconto);
		System.out.println("1 Quilowatt custa 1.73");
		System.out.format(" O valor com desconto de 10%: %f",valorDesconto);
		System.out.format(" Você gastou %5.0f quilowatts e o valor da conta será:%5.0fR$", quilowattGasto, valorGasto);

	}
}
