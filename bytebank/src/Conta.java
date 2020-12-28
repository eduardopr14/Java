class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) { // o public nesse caso é opcional
		this.saldo = this.saldo + valor; // o this. nesse caso é opcional
	}
	
	// void => método sem return
	// boolean, int, etc. => método com return
	
	public boolean saca(double valor) { // Os this. desse método são opcionais
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else { // Else opcional, como visto no método abaixo
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // Reutiliza o método deposita
			return true;
		}
		return false; // Não precisa da utilização do else
	}
}