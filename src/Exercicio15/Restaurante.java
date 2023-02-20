package Exercicio15;

public class Restaurante {
	private double ValorGasto, ValorReajuste, ValorFinal;
	
	Restaurante(double valorGasto) {
		setValorGasto(valorGasto);
		setValorReajuste(valorGasto);
	}
	public double setValorGasto(double ValorGasto) {
		return this.ValorGasto = ValorGasto;
	}
	public double setValorReajuste(double ValorGasto) {
		return this.ValorReajuste = (ValorGasto * 10) /100;
	}
	public void ValorFinal() {
		ValorFinal = ValorGasto + ValorReajuste;
		System.out.format(" O valor da conta de: %1.1fR$ sofreu um reajuste de %1.0fR$ e se tornou: %1.0fR$", ValorGasto,ValorReajuste, ValorFinal);
	}
}
