package br.com.pacotes.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		// String n�o � uma vari�vel e sim um Objeto
		// String � imutav�l | N�o pode ser mudado | Deve criar uma nova String para a "mudan�a"
		
		String nome = "Alura";
		String outro1 = nome.replace("A", "a");
		System.out.println("Outro 1: " + outro1);
		
		nome.toLowerCase(); // Isso n�o alterar� o "Alura" guardado no objeto nome
		
		String outro2 = nome.replace('l', 'L'); // '' = aspas simples s� podem conter um caracter
		System.out.println("Outro 2: " + outro2);
		
		char outro3 = nome.charAt(2); // Caracter (char) que est� na terceira posi��o (0, 1, 2, 3, etc.) -> Come�a no 0
		System.out.println("Outro 3: " + outro3);
		
		int posicao = nome.indexOf("ur"); // Posi��o que come�a a String "buscada"
		System.out.println("Posi��o: " + posicao);
		
		String sub = nome.substring(1); // Qual os caracteres a partir de uma posi��o
		System.out.println("Substring: " + sub);
		
		int tamanho = nome.length(); // Tamanho da String
		System.out.println("Tamanho: " + tamanho);
		
		String vazio = "";
		System.out.println("Vazio: " + vazio.isEmpty()); // String est� vazia?
		
		String vazio2 = " ";
		String vazio3 = vazio2.trim(); // Tirar os espa�os vazios => Ficar� vazio
		System.out.println("Vazio 2 e 3: " + vazio3.isEmpty());
		
		String vazio4 = "   Alura   "; 
		String vazio5 = vazio4.trim(); // Tirar os espacos vazios => Ficar� vazio
		System.out.println("Vazio 4: " + vazio4); // Sem tirar os espa�os
		System.out.println("Vazio 5: " + vazio5); // Tirando os espa�os
		
		String outro4 = "Eduardo";
		System.out.println("Outro 4: " + outro4.contains("Edu"));
		
		// ------------------------------------------------------------------------------------------
		
		System.out.println(""); // Pular linha
		
		for(int i = 0; i < nome.length(); i++) { // Percorrer a String
			System.out.println(nome.charAt(i));  // Imprimir caracter por caracter da String nome
		}
		
	}
	
}
