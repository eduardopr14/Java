
//Gerente extends Funcionario = Gerente � um Funcionario = Gerente herda da classe Funcionario
public class Gerente extends Funcionario { 
	
	private int senha;
	
	public Gerente() {
		
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
//		Para usar a classe getBonificacao da m�e (que poderia ser um padr�o) => super.getBonificacao() + ...
		System.out.println("Gerente!");
		return super.getSalario(); // super.getBonificacao() adicionar� a regra padr�o (funcionario) ao gerente (+0.05%)
//		.super � parecido com o this. mas quer dizer que o atributo "vem" da classe m�e (super classe)
	}

	
}
