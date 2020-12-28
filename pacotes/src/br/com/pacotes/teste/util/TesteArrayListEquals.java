package br.com.pacotes.teste.util;

import java.util.ArrayList;

import br.com.pacotes.modelo.Conta;
import br.com.pacotes.modelo.ContaCorrente;
import br.com.pacotes.modelo.ContaPoupanca;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		// Exemplo 1 --------------------------------------------------------------------------------------------------------
		
//		// boolean existe = lista.contains(cc3); // contains
//		
//		System.out.println("J� existe: " + existe);
//		
//		for(Conta conta : lista) {
//			// if(conta == cc3) { // conta == cc2 vai retornar true // Implementado na classe Conta
//			if(conta.ehIgual(cc3)) { // if de compara��o -> como se fosse o contains de cima, mas compara o n�mero e a ag�ncia
//				System.out.println("J� tenho essa refer�ncia!");
//			}
//		}
		
		// Sobrescrevendo o m�todo .contains para ficar igual a classe ehIgual
		boolean existe = lista.contains(cc3);
		System.out.println("J� existe? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
	
}
