
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente eduardo = new Cliente();
		eduardo.setNome("Eduardo");
		
		conta.setTitular(eduardo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}
	
}
