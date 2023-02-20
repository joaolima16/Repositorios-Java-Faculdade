package Exercicio13;

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		final double Velocidade, TempoGasto;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tempo gasto em minutos na viagem");
		TempoGasto = scan.nextDouble();

		System.out.println("Digite a velocidade média da viagem");
		Velocidade = scan.nextDouble();

		if (Velocidade < 0 || TempoGasto < 0) {
			System.out.println("Algum dado foi digitado incorretamente! ");
		} else {
			Viagem viagem = new Viagem(TempoGasto, Velocidade);
			System.out.format("Velocidade média do veiculo: %1.0f KM/H ", Velocidade);
			System.out.format("Tempo gasto na viagem %1.0f minutos \n", TempoGasto);
			viagem.Distancia();
			viagem.CustoViagem();
			scan.close();
		}

	}
}
