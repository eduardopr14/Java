package br.com.pacotes.teste;

public class TesteArray {
	
	// Array[]
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // 5 será o tamanho
		// Pode ser escrito de várias formas: int[]idades, int idades[], int[] idades
		
		idades[0] = 29;
		idades[1] = 19;
//		idades[2] = 39;
		
		System.out.println("Idade[0]: " + idades[0]);
		System.out.println("Idade[1]: " + idades[1]);
		System.out.println("Idade[2]: " + idades[2] + "\n"); // Posição sem um valor definido
		
		int idade1 = idades[0];
		System.out.println("Idade 1: " + idade1 + "\n");
		
		System.out.println("Tamanho do Array: " + idades.length + "\n");
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i; // Valor da posição do array
			System.out.println(idades[i]); // Imprimir as posições do array
		}
		
		// ----------------------------------------------------------------------------------
		
		// Criando Arrays
		
		int[] numeros = new int[6];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		// É igual a
		
		int[] refs = {1,2,3,4,5};
		
	}
	
}