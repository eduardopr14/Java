
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1337, 24226);
		System.out.println(conta1.getAgencia());
		
		Conta conta2 = new Conta(2609, 24226);
		System.out.println(conta2.getAgencia());
		
		Conta conta3 = new Conta(7854, 24226);
		System.out.println(conta3.getAgencia());
		
		System.out.println(Conta.getTotal());
		
	}
	
}
