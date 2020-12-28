package br.com.pacotes.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.pacotes.modelo.Cliente;
import br.com.pacotes.modelo.Conta;
import br.com.pacotes.modelo.ContaCorrente;
import br.com.pacotes.modelo.ContaPoupanca;

public class TesteOrdenacao {
	
	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);
        
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // -------------------------------------------------------------------------
        
        System.out.println("\n--------------------------------------\n");
        System.out.println("Sem Ordenação: \n");
		
        // Antes da ordenação
        for (Conta conta : lista) {
			System.out.println(conta);
		}

        // -------------------------------------------------------------------------
        
//        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
//        lista.sort(comparator);
        lista.sort(new NumeroDaContaComparator());
        
        System.out.println("\n--------------------------------------\n");
        System.out.println("Ordenação por Número: \n");
        
        // Depois da ordenação
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        // -------------------------------------------------------------------------
        
        System.out.println("\n--------------------------------------\n");
        System.out.println("Ordenação Alfabética : \n");
        
        lista.sort(new TitularDaContaComparator());
        
        for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
        
        // -------------------------------------------------------------------------
        
        System.out.println("\n--------------------------------------\n");
        System.out.println("Ordenação Implementado na Classe Conta (Saldo): \n");
        
        Collections.sort(lista);
//        Collections.reverse(lista);

        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
	}
	
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		return nomeC1.compareTo(nomeC2); // Comparar os dois Strings -> Ordem Alfabética
		
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		Forma 2
//		return c1.getNumero() - c2.getNumero();
		
//		Forma 3
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		
//		if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		return 0;
		
	}
	
}

