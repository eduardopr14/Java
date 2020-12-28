
public class TestaWhile {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 10) { // <= 10 (Imprimirá de 0 a 10) e < 10 (Imprimirá de 0 a 9)
			System.out.println(contador);
			contador++;
			
			// contato++; é igual a contador += 1;
			// contador *= 2; é exatamente igual a contador = contador * 2;
		}
		
	}
	
}
