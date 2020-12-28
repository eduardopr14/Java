package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel, Serializable {
	
	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
}
