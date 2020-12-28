
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais\n"); // \n para pular linha

		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("É maior ou igual!");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você é de menor, mas está acompanhado!");
			} else {
				System.out.println("É menor e não está acompanhado!");
			}
		}
		
	}

}
