
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais\n"); // \n para pular linha

		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("� maior ou igual!");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� � de menor, mas est� acompanhado!");
			} else {
				System.out.println("� menor e n�o est� acompanhado!");
			}
		}
		
	}

}
