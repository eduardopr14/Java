
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais\n"); // \n para pular linha

		int idade = 17;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2; // True ou False | Ou uma condição (que resulta em True ou False)

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja Bem-Vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar!");
		}

	}

}
