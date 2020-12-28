
class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular; // Referente a classe de Cliente (Contendo nome, cpf e profiss�o)
	// Cliente titular = new Cliente(); toda conta cria um novo Cliente automaticamente
	
	public void deposita(double valor) { 
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) { 
		if(this.saldo >= valor) { 
			this.saldo -= valor;
			return true;
		} else { 
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) { 
			System.out.println("N�o pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(numero <= 0) {
			System.out.println("N�o pode ser menor ou igual a 0!");
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
	
}
