package Exercicio10;

public class Retangulo {
	private double base, altura, perimetro,area;
	
	Retangulo(double base, double altura) {
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
	public void Perimetro() {
		this.perimetro = (this.base + this.altura) /2;
		System.out.println("O perimetro do retangulo é: " + perimetro);
	}
	public void Area() {
		this.area = this.base * this.altura;
		System.out.println("Área Retangulo : " + area);
	}
}
