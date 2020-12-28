package br.com.pacotes.teste;

import br.com.pacotes.modelo.Cliente;
import br.com.pacotes.modelo.Conta;
import br.com.pacotes.modelo.ContaCorrente;
import br.com.pacotes.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		// array => int[] idades = new int[5]
		
		Conta[] contas = new Conta[5]; // Cria um array preenchido com valores nulls
		
		ContaCorrente cc = new ContaCorrente(22, 11); // Cria��o do objeto
		contas[0] = cc; // Atribui a referencia do objeto cc1 para a primeira posicao do array contas
		
		ContaPoupanca cp = new ContaPoupanca(22, 22);
		contas[1] = cp;
		
		System.out.println(contas[1].getNumero());
		
//		ContaCorrente ref = contas[1]; // N�o pode guardar uma ContaPoupanca dentro de uma ref do tipo ContaCorrente
//		ContaPoupanca ref = contas[1]; // Tamb�m n�o vai funcionar => Conta diferente de ContaPoupanca
		
//		ContaCorrente ref2 = (ContaCorrente) contas[1]; // Cast => transforma o tipo mais gen�rico em um tipo mais espec�fico
		// ATEN��O -> Isso n�o funcionar� porque o tipo de contas[1] ainda n�o bater� com ContaCorrente, contas[1] � ContaPoupanca
		
		Conta ref1 = contas[1];
		
		System.out.println(ref1); // Imprimir� um texto por causa do @Override do toString()
		System.out.println(ref1.getNumero());
		
		// -------------------------------------------------------------------------------------------
		
		Conta[] contas2 = new Conta[5]; // Tipo mais gen�rico de Conta
		ContaCorrente[] contas3 = new ContaCorrente[5]; // Tipos mais espec�ficos
		ContaPoupanca[] contas4 = new ContaPoupanca[5];
		
		Object[] object = new Object[5]; // Tipo mais gen�rico de todos
		
		// Poder� guardar qualquer tipo dentro
		
		Cliente cliente = new Cliente();
		object[0] = cliente;
		object[1] = cc;
		object[2] = cp;
		
		// Por�m n�o poder� utilizar os m�todos mais espec�ficos sem um cast
//		System.out.println(object[1].getNumero());
		
		ContaCorrente ref3 = (ContaCorrente) object[1];
		System.out.println(ref3);
		
	}
	
}
