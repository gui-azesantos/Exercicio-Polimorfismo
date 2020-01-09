package com.gft.veiculogft;

public class Carro extends VeiculoGFT {
	private String marca;
	private int portas;
	private String ano;

	public Carro(String modelo, int velocidade, int passageiros, float combustivel, String marca, int portas,
			String ano) {
		super(modelo, velocidade, passageiros, combustivel = 100);
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	// Métodos
	public void acelera(int quantidade) {
		if (isLigado) {
			int velocidadeNova = this.velocidade + quantidade;
			this.velocidade = velocidadeNova;
			combustivel = combustivel - 1;
			System.out.println("O Carro está " + velocidade + "Km/h");
		} else {
			System.out.println("O Carro está desligado");
		}
	}

	public void abastecer(int qtdlitros) {

		System.out.println("Seu tanque é: " + combustivel);
		if (combustivel <= 100) {
			if (qtdlitros <= (100 - combustivel)) {
				combustivel = combustivel + qtdlitros;
				System.out.println("Seu tanque é A: " + combustivel);
			} else {
				System.out.println("A quantidade de combustivel é maior do que a capacidade do tanque");
				System.out.println("Seu tanque é B: " + combustivel);
			}
		} else {
			System.out.println("Tanque cheio!");
		}
	}

	public void desliga() {
		super.desliga();
	}

}
