package br.com.pacotes.teste;

import br.com.pacotes.modelo.ContaCorrente;
import br.com.pacotes.modelo.ContaPoupanca;

public class TesteObject {
	
	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		
//		Object cp = new ContaPoupanca(33, 22); // Object pode chamar qualquer outra referencia => Tipo mais gen�rico
		
		// Imprimir� a referencia br.com.bytebank...
//		System.out.println(cc);
//		System.out.println(cp);
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
		System.out.println();
		
		// N�o precisa usar o .toString() => acontece automaticamente com o sysout()
		
		System.out.println("Sem o toString: " + cc); // o , Agencia: ... vem da classe m�e "Conta", que seria aplicada nos dois casos
		System.out.println("Sem o toString: " + cp); // j� que os dois utilizam o super.toString() da classe m�e
		
		println();
		
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	// Funcionaria para imprimir tanto cc quanto cp (m�e de cc e cp)
//	static void println(Conta conta) {}
	// Mais gen�rico => pode implementar qualquer objeto (tanto cc quanto cp)
	static void println(Object obj) {}

}
