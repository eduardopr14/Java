
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66; // 66 � o ASC de B Mai�sculo
		System.out.println(valor);
		
		valor = (char) (valor + 1); // Casting para Char (Resultado: 67 = C em ASC)
		System.out.println(valor);
		
		String palavra = "Jackie Cleiton";
		System.out.println(palavra);
		
		palavra = palavra + 2020; // N�o precisa fazer Casting
		System.out.println(palavra);
		
	}
	
}
