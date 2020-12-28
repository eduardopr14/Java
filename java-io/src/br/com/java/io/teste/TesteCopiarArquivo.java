package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiarArquivo {
	
	public static void main(String[] args) throws IOException {
		
		// A cada Enter, escreve o codigo escrito no Console
		
//		FileInputStream fis = new FileInputStream("textoteste.txt");
		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
//		OutputStream fos = new FileOutputStream("textoteste2.txt");
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
		// Escrever no Console, se der dois "Enters" seguidos, acaba o processo
		
		// ----------------------------------------------------------------------------------------------------------------
		
		// Escrever no Console e gravar no textoteste2.txt
		
//		FileInputStream fis = new FileInputStream("textoteste.txt");
//		InputStream fis = System.in;
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
//		
//		OutputStream fos = new FileOutputStream("textoteste2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
//		String linha = br.readLine();
//		
//		while(linha != null && !linha.isEmpty()) {
//			bw.write(linha);
//			bw.newLine();
//			linha = br.readLine();
//		}
//		
//		br.close();
//		bw.close();
//		
//		// Escrever no Console, se der dois "Enters" seguidos, acaba o processo
		
		// ----------------------------------------------------------------------------------------------------------------
		
		// Copia o conteúdo do primeiro arquivo para o segundo arquivo
		
//		FileInputStream fis = new FileInputStream("textoteste.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
//		
//		OutputStream fos = new FileOutputStream("textoteste2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
//		String linha = br.readLine();
//		
//		while(linha != null && !linha.isEmpty()) {
//			bw.write(linha);
//			bw.newLine();
//			linha = br.readLine();
//		}
//		
//		br.close();
//		bw.close();
		
	}
	
}
