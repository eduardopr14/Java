package br.com.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		cliente.setNome("Nico");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("234113131");
		
		// ---------------------------------------------------------------------------------
				
//		String nome = "Nico Steppat";
		
		// Criar
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		// ---------------------------------------------------------------------------------
		
		// Ler nome
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//		String nome = (String) ois.readObject();
//		ois.close();
//		
//		System.out.println(nome);
		
		// ---------------------------------------------------------------------------------
		
		// Ler nome
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(cliente.getNome());
		
	}
	
}
