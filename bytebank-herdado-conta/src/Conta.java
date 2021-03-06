
public abstract class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
//		System.out.print("\nO total de conta �: " + Conta.total  + " - ");
//		System.out.println("Criando conta n�mero: " + this.numero);
	}
	
	public void deposita(double valor) { 
		this.saldo += valor;
		System.out.println("Conta de Destino: " + this.agencia + "-" + this.numero + " - Saldo: " + this.saldo);
	}
	
	public boolean saca(double valor) { 
		if(this.saldo >= valor) { 
			this.saldo -= valor;
			System.out.println("\nConta de Origem: " + this.agencia + "-" + this.numero + " - Saldo: " + this.saldo);
			return true;
		} else { 
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta origem, Conta destino) {
		if(this.saldo >= valor) {
			origem.saca(valor);
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
	
	public static int getTotal() {
		System.out.print("\nQuantidade de Contas: ");
		return Conta.total;
	}
	
}
