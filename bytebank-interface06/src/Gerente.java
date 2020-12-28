
// Gerente extends Funcionario = Gerente é um Funcionario = Gerente herda da classe Funcionario
// Gerente "assina o contrato" de Autenticavel = implementa uma interface

public class Gerente extends Funcionario implements Autenticavel { 
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
//		Para usar a classe getBonificacao da mãe (que poderia ser um padrão) => super.getBonificacao() + ...
		System.out.println("Gerente!");
		return super.getSalario(); // super.getBonificacao() adicionará a regra padrão (funcionario) ao gerente (+0.05%)
//		.super é parecido com o this. mas quer dizer que o atributo "vem" da classe mãe (super classe)
	}

	
}
