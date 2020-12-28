package br.com.pacotes.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		// String não é uma variável e sim um Objeto
		// String é imutavél | Não pode ser mudado | Deve criar uma nova String para a "mudança"
		
		String nome = "Alura";
		String outro1 = nome.replace("A", "a");
		System.out.println("Outro 1: " + outro1);
		
		nome.toLowerCase(); // Isso não alterará o "Alura" guardado no objeto nome
		
		String outro2 = nome.replace('l', 'L'); // '' = aspas simples só podem conter um caracter
		System.out.println("Outro 2: " + outro2);
		
		char outro3 = nome.charAt(2); // Caracter (char) que está na terceira posição (0, 1, 2, 3, etc.) -> Começa no 0
		System.out.println("Outro 3: " + outro3);
		
		int posicao = nome.indexOf("ur"); // Posição que começa a String "buscada"
		System.out.println("Posição: " + posicao);
		
		String sub = nome.substring(1); // Qual os caracteres a partir de uma posição
		System.out.println("Substring: " + sub);
		
		int tamanho = nome.length(); // Tamanho da String
		System.out.println("Tamanho: " + tamanho);
		
		String vazio = "";
		System.out.println("Vazio: " + vazio.isEmpty()); // String está vazia?
		
		String vazio2 = " ";
		String vazio3 = vazio2.trim(); // Tirar os espaços vazios => Ficará vazio
		System.out.println("Vazio 2 e 3: " + vazio3.isEmpty());
		
		String vazio4 = "   Alura   "; 
		String vazio5 = vazio4.trim(); // Tirar os espacos vazios => Ficará vazio
		System.out.println("Vazio 4: " + vazio4); // Sem tirar os espaços
		System.out.println("Vazio 5: " + vazio5); // Tirando os espaços
		
		String outro4 = "Eduardo";
		System.out.println("Outro 4: " + outro4.contains("Edu"));
		
		// ------------------------------------------------------------------------------------------
		
		System.out.println(""); // Pular linha
		
		for(int i = 0; i < nome.length(); i++) { // Percorrer a String
			System.out.println(nome.charAt(i));  // Imprimir caracter por caracter da String nome
		}
		
	}
	
}
