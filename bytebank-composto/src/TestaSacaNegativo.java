
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		System.out.println("Conseguiu sacar: " + conta.saca(200));
		
		// System.out.println("Saldo: " + conta.saldo); // Um atributo Privado não pode ser modificado ou lido diretamente, só com o uso de métodos
		
		System.out.println(conta.getSaldo());
		
	}
	
}
