package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("textoteste2.txt");
		fw.write("Oi, tudo bem?");
//		fw.write("\n");
		fw.write(System.lineSeparator()); // Pula uma linha em qualquer sistema operacional
		fw.write("Sou o Eduardo");
		
		fw.close();
		
		// --------------------------------------------------------------------------------
		
		FileWriter fw2 = new FileWriter("textoteste2.txt");
		BufferedWriter bw = new BufferedWriter(fw2);
		bw.write("Oi, tudo bem?");
		bw.newLine();
		bw.write("Sou o Eduardo");
		
		bw.close();
		
	}
	
}
