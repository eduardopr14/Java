
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		System.out.println("Conta 1: " + conta.saldo);
		
		// conta.saca(20); // Apenas mostra o saldo após a operação, não mostra o return
		// System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20); // Coletar o resultado de True ou False
		System.out.println("Conseguiu retirar da Conta 1: " + conseguiuRetirar);
		
		// --- Primeira Transferência ---
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		conta2.transfere(300, conta);
		System.out.println("\nConta 2: " + conta2.saldo);
		System.out.println("Conta 1: " + conta.saldo);
		
		// --- Segunda Transferência ---
		
		if(conta2.transfere(3000, conta)) {
			System.out.println("\nTransferência realizada com sucesso!");
		} else {
			System.out.println("\nTransferéncia negada!");
		}
		System.out.println("Conta 2: " + conta2.saldo);
		System.out.println("Conta 1: " + conta.saldo);
		
		// --- Terceira Transferência ---
		
		boolean sucessoTransferencia = conta2.transfere(300, conta);
		
		if(sucessoTransferencia) {
			System.out.println("\nTransferência realizada com sucesso!");
		} else {
			System.out.println("\nTransferéncia negada!");
		}
		System.out.println("Conta 2: " + conta2.saldo);
		System.out.println("Conta 1: " + conta.saldo);
		
		// --- Teste Titular ---
		
		conta.titular = "Eduardo";
		System.out.println("\nNome do Títular: " + conta.titular);
		
	}
	
}
