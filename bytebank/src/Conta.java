class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) { // o public nesse caso � opcional
		this.saldo = this.saldo + valor; // o this. nesse caso � opcional
	}
	
	// void => m�todo sem return
	// boolean, int, etc. => m�todo com return
	
	public boolean saca(double valor) { // Os this. desse m�todo s�o opcionais
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else { // Else opcional, como visto no m�todo abaixo
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // Reutiliza o m�todo deposita
			return true;
		}
		return false; // N�o precisa da utiliza��o do else
	}
}