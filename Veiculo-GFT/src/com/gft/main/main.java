package com.gft.main;

import com.gft.veiculogft.*;

import java.util.Scanner;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		
		Carro A = new Carro(null, 0, 0, 0, null, 0, null);
		A.liga();
		A.acelera(20);
		A.acelera(20);
		A.acelera(20);
		A.abastecer(50);

		Aviao B = new Aviao(null, 0, 0, 0, null, null);
		B.liga();
		B.acelera(20);
		B.acelera(20);
		B.acelera(20);
		B.abastecer("200");
		B.freiar(20);
		B.desliga();

		Caminhao C = new Caminhao(null, 0, 0, 0, null, 0, null);
		C.liga();
		C.acelera(20);
		C.acelera(20);
		C.acelera(20);
		C.abastecer(50);
		C.freiar(20);
		C.desliga();
	}
}
