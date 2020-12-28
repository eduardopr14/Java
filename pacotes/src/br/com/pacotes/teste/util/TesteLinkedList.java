package br.com.pacotes.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.pacotes.modelo.Conta;
import br.com.pacotes.modelo.ContaCorrente;

public class TesteLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size() + "\n");
		
		Conta cc3 = new ContaCorrente(33, 31);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(33, 32);
		lista.add(cc4);
		
		// Iteração / Iterar
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		
		// Mesma coisa do for de cima
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
		
		// ----------------------------------------------------
		
		System.out.println();
		
		// ATENÇÃO
		
		// Se o ArrayList for criado com o tipo de Object definido, não é preciso fazer cast dos elementos
		// Tipificado
		
		ArrayList<Conta> lista2 = new ArrayList<Conta>();
		
		Conta cc5 = new ContaCorrente(55, 66);
		lista2.add(cc5);
		
		Conta ref2 = lista2.get(0);
		System.out.println(ref2 + "\n");
		
		for(Conta oRef : lista2) {
			System.out.println(oRef);
		}
		
	}
	
}
