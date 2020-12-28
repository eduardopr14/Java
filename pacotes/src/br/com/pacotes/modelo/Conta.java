package br.com.pacotes.modelo;

public abstract class Conta extends Object implements Comparable<Conta>{
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
//		System.out.print("\nO total de conta é: " + Conta.total  + " - ");
//		System.out.println("Criando conta número: " + this.numero);
	}
	
	public void deposita(double valor) { 
		this.saldo += valor;
		System.out.println("Conta de Destino: " + this.agencia + "-" + this.numero + " - Saldo: " + this.saldo);
	}
	
	public void saca(double valor) { 
		// if invertido
		if(this.saldo < valor) { // Se tem um problema
			throw new SaldoInsuficienteException("\nErro - Saldo: " + this.saldo + ", Valor: " + valor);
		} else {
			this.saldo -= valor;
			System.out.println("\nConta de Origem: " + this.agencia + "-" + this.numero + " - Saldo: " + this.saldo);
		}
	}
	
	public void transfere (double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) { 
			System.out.println("Não pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(numero <= 0) {
			System.out.println("Não pode ser menor ou igual a 0!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		System.out.print("\nQuantidade de Contas: ");
		return Conta.total;
	}
	
//	public boolean ehIgual(Conta outra) {
//		if(this.agencia != outra.agencia || this.numero != outra.numero) {
//			return false;
//		}
//		return true;
//	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia || this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agência: " + this.agencia + ", Saldo: " + this.saldo;
	}
	
}
