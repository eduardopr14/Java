
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		System.out.println("Conseguiu sacar: " + conta.saca(200));
		
		// System.out.println("Saldo: " + conta.saldo); // Um atributo Privado n�o pode ser modificado ou lido diretamente, s� com o uso de m�todos
		
		System.out.println(conta.getSaldo());
		
	}
	
}
