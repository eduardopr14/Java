
public class TestaReferencias {
	
	public static void main(String[] args) {
		
//		Funcionario gerente = new Gerente(); // Funcionário => Gerente (Funciona porque Gerente "é um" Funcionario)
		
//		Funcionario p1 = new EditorVideo();
//		p1.setSalario(1000.0);
//		
//		Funcionario p2 = new Gerente();
//		p2.setSalario(1000.0);
//		
//		ControleBonificacao controle = new ControleBonificacao();
//		controle.registra(p1);
//		controle.registra(p2);
		
		Funcionario p3 = new Designer();
		p3.setSalario(2000.0);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(p3); // Valor fixo de 200
		
		System.out.println(controle.getSoma());
		
	}
	
}
