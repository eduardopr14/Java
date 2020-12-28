package br.com.pacotes.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29;
		List numeros = new ArrayList();
		numeros.add(idade); // Isso não deveria funcionar => Listas só recebem referências
		
		// O Java automaticamente faz um processo chamado Autoboxing => Cria um Object de valor 29 com referência
		// Colocando esse Object dentro da List
		
		int idade2 = 30;
		
		Integer idadeRef = Integer.valueOf(30); // Autoboxing
		int valor = idadeRef.intValue(); // Unboxing
		
		String s = args[0]; // "10"
		Integer numero = Integer.valueOf(s); // Parse
		System.out.println(s);
		
		int numero2 = Integer.parseInt(s); // ParseInt
		System.out.println(s);
		
		System.out.println(idadeRef.doubleValue()); // Transforma em double
		
		System.out.println(Integer.MAX_VALUE); // Valor máximo que um integer pode guardar
		
	}
	
}
