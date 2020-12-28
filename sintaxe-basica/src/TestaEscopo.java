
public class TestaEscopo {

	public static void main(String[] args) {

		int valor = 1;

		// --- Primeiro Caso ---

		if (valor >= 2) {
			boolean verdade1 = true;
		}

		// System.out.println(verdade1); // Esse comando vai dar erro
		// A vari�vel verdade1 n�o funcionar� aqui pois est� no escopo da estrutura if

		// --- Segundo Caso ---

		boolean verdade2 = true;

		if (valor >= 2) {
			System.out.println(verdade2); // Nesse caso a vari�vel verdade2 existe pois foi declarado no escopo acima do if
		}

		// --- Terceiro Caso ---

		boolean verdade3;

		if (valor >= 2) {
			verdade3 = true;
		}

		// System.out.println(verdade3); // Nesse caso va vari�vel verdade3 ir� retornar
		// um erro pois caso valor for menor que 2 ela n�o existir�

	}

}
