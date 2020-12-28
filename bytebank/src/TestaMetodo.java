
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		System.out.println("Conta 1: " + conta.saldo);
		
		// conta.saca(20); // Apenas mostra o saldo ap�s a opera��o, n�o mostra o return
		// System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20); // Coletar o resultado de True ou False
		System.out.println("Conseguiu retirar da Conta 1: " + conseguiuRetirar);
		
		// --- Primeira Transfer�ncia ---
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		conta2.transfere(300, conta);
		System.out.println("\nConta 2: " + conta2.saldo);
		System.out.println("Conta 1: " + conta.saldo);
		
		// --- Segunda Transfer�ncia ---
		
		if(conta2.transfere(3000, conta)) {
			System.out.println("\nTransfer�ncia realizada com sucesso!");
		} else {
			System.out.println("\nTransfer�ncia negada!");
		}
		System.out.println("Conta 2: " + conta2.saldo);
		System.out.println("Conta 1: " + conta.saldo);
		
		// --- Terceira Transfer�ncia ---
		
		boolean sucessoTransferencia = conta2.transfere(300, conta);
		
		if(sucessoTransferencia) {
			System.out.println("\nTransfer�ncia realizada com sucesso!");
		} else {
			System.out.println("\nTransfer�ncia negada!");
		}
		System.out.println("Conta 2: " + conta2.saldo);
		System.out.println("Conta 1: " + conta.saldo);
		
		// --- Teste Titular ---
		
		conta.titular = "Eduardo";
		System.out.println("\nNome do T�tular: " + conta.titular);
		
	}
	
}
