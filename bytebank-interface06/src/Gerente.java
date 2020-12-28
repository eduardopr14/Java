
// Gerente extends Funcionario = Gerente � um Funcionario = Gerente herda da classe Funcionario
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
//		Para usar a classe getBonificacao da m�e (que poderia ser um padr�o) => super.getBonificacao() + ...
		System.out.println("Gerente!");
		return super.getSalario(); // super.getBonificacao() adicionar� a regra padr�o (funcionario) ao gerente (+0.05%)
//		.super � parecido com o this. mas quer dizer que o atributo "vem" da classe m�e (super classe)
	}

	
}
