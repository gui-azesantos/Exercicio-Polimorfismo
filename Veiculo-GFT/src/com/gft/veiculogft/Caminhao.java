package com.gft.veiculogft;

public class Caminhao extends VeiculoGFT {
	private String marca;
	private int portas;
	private String ano;

		public Caminhao(String modelo, int velocidade, int passageiros, float combustivel, String marca, int portas,
			String ano) {
		super(modelo, velocidade, passageiros, combustivel= 150);
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
		
		


	public void acelera(int quantidade) {
		if (isLigado) {
			int velocidadeNova = this.velocidade + quantidade;
			this.velocidade = velocidadeNova;
			combustivel = combustivel - 1;
			System.out.println("O Caminh�o est� " + velocidade + "Km/h");
		} else {
			System.out.println("O Caminh�o est� desligado");
		}
	}

	public void abastecer(float qtdlitros) {
		System.out.println("Seu tanque �: " + combustivel);
		if (combustivel < 150.0) {
			if (qtdlitros <= (150.0 - combustivel)) {
				combustivel = combustivel + qtdlitros;
				System.out.println("Seu tanque � A: " + combustivel);
			} else {
				System.out.println("A quatidade de combustivel � maior do que a capacidade do tanque");
				System.out.println("Seu tanque � B: " + combustivel);
			}
		}else {
			System.out.println("Tanque cheio!");
		}
	}

	public void desliga() {
		super.desliga();
	}


}
