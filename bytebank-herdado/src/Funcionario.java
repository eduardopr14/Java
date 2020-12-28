
// N�o pode ser instanciada porque � abstract
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; // protected => todas as classes filho ter�o acesso a esse atributo
	
	public Funcionario() {
		
	}
	
	public abstract double getBonificacao(); // M�todo abstract => n�o tem um c�digo padr�o => filhos precisam implementar
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
