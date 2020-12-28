package br.com.pacotes.teste;

import br.com.pacotes.modelo.Cliente;
import br.com.pacotes.modelo.Conta;
import br.com.pacotes.modelo.ContaCorrente;
import br.com.pacotes.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		// array => int[] idades = new int[5]
		
		Conta[] contas = new Conta[5]; // Cria um array preenchido com valores nulls
		
		ContaCorrente cc = new ContaCorrente(22, 11); // Criação do objeto
		contas[0] = cc; // Atribui a referencia do objeto cc1 para a primeira posicao do array contas
		
		ContaPoupanca cp = new ContaPoupanca(22, 22);
		contas[1] = cp;
		
		System.out.println(contas[1].getNumero());
		
//		ContaCorrente ref = contas[1]; // Não pode guardar uma ContaPoupanca dentro de uma ref do tipo ContaCorrente
//		ContaPoupanca ref = contas[1]; // Também não vai funcionar => Conta diferente de ContaPoupanca
		
//		ContaCorrente ref2 = (ContaCorrente) contas[1]; // Cast => transforma o tipo mais genérico em um tipo mais específico
		// ATENÇÃO -> Isso não funcionará porque o tipo de contas[1] ainda não baterá com ContaCorrente, contas[1] é ContaPoupanca
		
		Conta ref1 = contas[1];
		
		System.out.println(ref1); // Imprimirá um texto por causa do @Override do toString()
		System.out.println(ref1.getNumero());
		
		// -------------------------------------------------------------------------------------------
		
		Conta[] contas2 = new Conta[5]; // Tipo mais genérico de Conta
		ContaCorrente[] contas3 = new ContaCorrente[5]; // Tipos mais específicos
		ContaPoupanca[] contas4 = new ContaPoupanca[5];
		
		Object[] object = new Object[5]; // Tipo mais genérico de todos
		
		// Poderá guardar qualquer tipo dentro
		
		Cliente cliente = new Cliente();
		object[0] = cliente;
		object[1] = cc;
		object[2] = cp;
		
		// Porém não poderá utilizar os métodos mais específicos sem um cast
//		System.out.println(object[1].getNumero());
		
		ContaCorrente ref3 = (ContaCorrente) object[1];
		System.out.println(ref3);
		
	}
	
}
