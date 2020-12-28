package br.com.pacotes.teste;

import br.com.pacotes.modelo.Conta;
import br.com.pacotes.modelo.ContaCorrente;
import br.com.pacotes.modelo.GuardadorDeReferencias;

public class TesteGuardador {
	
	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc1 = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		
		guardador.adiciona(cc1);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.println(ref);
		System.out.println("Número: " + ref.getNumero());
		
	}
	
}
