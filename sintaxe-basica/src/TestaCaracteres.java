
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66; // 66 é o ASC de B Maiúsculo
		System.out.println(valor);
		
		valor = (char) (valor + 1); // Casting para Char (Resultado: 67 = C em ASC)
		System.out.println(valor);
		
		String palavra = "Jackie Cleiton";
		System.out.println(palavra);
		
		palavra = palavra + 2020; // Não precisa fazer Casting
		System.out.println(palavra);
		
	}
	
}
