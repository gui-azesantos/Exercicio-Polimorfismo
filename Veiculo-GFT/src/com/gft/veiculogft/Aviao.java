package com.gft.veiculogft;

public class Aviao extends VeiculoGFT {
	private String tipo;
	private String uso;

	public Aviao(String modelo, int velocidade, int passageiros, float combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel = 200);
		this.tipo = tipo;
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public void abastecer(String Stringqtdlitros) {
		System.out.println("Seu tanque �: " + combustivel);
		int qtdlitros = Integer.parseInt(Stringqtdlitros);

		if (combustivel <= 200) {
			if (qtdlitros <= (200 - combustivel)) {
				combustivel = combustivel + qtdlitros;
				System.out.println("Seu tanque � : " + combustivel);
			} else {
				System.out.println("A quatidade de combustivel � maior do que a capacidade do tanque");
				System.out.println("Seu tanque � : " + combustivel);
			}
		} else {
			System.out.println("Tanque cheio!");
		}
	}

	public void acelera(int quantidade) {
		if (isLigado) {
			int velocidadeNova = this.velocidade + quantidade;
			this.velocidade = velocidadeNova;
			combustivel = combustivel - 20;
			System.out.println("O Avi�o est� � " + velocidade + "Km/h");
		} else {
			System.out.println("O Avi�o est� desligado");
		}
	}

	

}
