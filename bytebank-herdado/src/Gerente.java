
//Gerente extends Funcionario = Gerente é um Funcionario = Gerente herda da classe Funcionario
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
//		Para usar a classe getBonificacao da mãe (que poderia ser um padrão) => super.getBonificacao() + ...
		System.out.println("Gerente!");
		return super.getSalario(); // super.getBonificacao() adicionará a regra padrão (funcionario) ao gerente (+0.05%)
//		.super é parecido com o this. mas quer dizer que o atributo "vem" da classe mãe (super classe)
	}

	
}
