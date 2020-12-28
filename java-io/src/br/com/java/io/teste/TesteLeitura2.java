package br.com.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {		
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // Usar regras dos EUA
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format("%s - %04d-%d, %s: %.2f", tipoConta, agencia, numero, titular, saldo);
			String valorFormatado2 = String.format(new Locale("pt", "BR"),"%s - %04d-%d, %s: %.2f", tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			System.out.println(valorFormatado2);
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
//			System.out.println(valores[3]);
		}
		
		scanner.close();
		
		// ---------------------------------------------------
		
		// Parseando arquivo
		
		
		
	}
	
}
