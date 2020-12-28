package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWrite {
		
	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("textoteste2.txt");
		
		ps.print("Oi, Eduardo, ");
		ps.println("muito bom!");
		ps.println();
		ps.print("Att. Chefe");
		
		ps.close();
		
	}
	
}
