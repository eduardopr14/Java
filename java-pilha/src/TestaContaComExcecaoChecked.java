
public class TestaContaComExcecaoChecked {
	
	// Uma exce��o Checked ter� que implementar uma exce��o/throws/try-catch para funcionar
	// Desse modo o "programador" ser� obrigado a tratar o m�todo da maneira correta
	
	// Uma exce��o Uncheck n�o precisar�
	
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
