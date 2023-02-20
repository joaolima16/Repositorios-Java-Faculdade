package Exercicio11;

public class Triangulo {
private double base, altura,area;
	
	Triangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura <0) {
			System.out.println("Algum valor foi digitado incorretamente");
		}
		else {
			this.altura = altura;	
		}
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if(base < 0) {
			System.out.println("Algum valor foi digitado incorretamente");
		}
		else {
			this.base = base;	
		}
	}
	public void Area() {
		this.area = this.base * this.altura;
		System.out.println("Área do Triangulo: " + area);
	}
}
