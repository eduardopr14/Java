package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*; // Pega todas as classes que estão dentro do modelo

public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}
	
}
