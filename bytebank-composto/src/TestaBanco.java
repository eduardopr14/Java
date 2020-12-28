
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Eduardo");
		cliente.setCpf("222.222.222-22");
		cliente.setProfissao("Programador");
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.titular = cliente;
		System.out.println(conta.titular.getNome());
		System.out.println(conta.titular.getCpf());
		
		// Valor da referência
		System.out.println("\n" + conta.titular);
		System.out.println(cliente);
	}
	
}
