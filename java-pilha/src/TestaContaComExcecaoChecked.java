
public class TestaContaComExcecaoChecked {
	
	// Uma exceção Checked terá que implementar uma exceção/throws/try-catch para funcionar
	// Desse modo o "programador" será obrigado a tratar o método da maneira correta
	
	// Uma exceção Uncheck não precisará
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();
			System.out.println("Deu certo!");
		} catch (MinhaExcecao ex) {
			System.out.println("Tratamento");
		}
	}
	
}
