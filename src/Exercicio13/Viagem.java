package Exercicio13;

public class Viagem {
	private double Velocidade, TempoGasto, Distancia, Custo;

	
	Viagem(double Velocidade, double TempoGasto) {
		this.setTempoGasto(TempoGasto);
		this.setVelocidade(Velocidade);
	}
	public double getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(double velocidade) {
		Velocidade = velocidade;
	}
	public void setDistancia(double distancia) {
		Distancia = distancia;
	}
	
	public void setTempoGasto(double tempoGasto) {
		TempoGasto = tempoGasto;
	}
	public void Distancia() {
		this.Distancia = TempoGasto * Velocidade;
		if(Distancia >=1000) {
			this.Distancia = Distancia /1000;
			System.out.format("A distância percorrida foi de: %1.0f KM \n", Distancia);
		}
		else {
			System.out.format("A distância percorrida foi de: %1.0f Metros", Distancia);
		}
	}
	public void CustoViagem() {
		this.Custo = Distancia /12;
		System.out.format(" Foram usados: %1.0f Litros de combustivel  " , Custo);
	}
}
