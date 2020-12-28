package br.com.pacotes.teste.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorNext {
	
	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi");
		nomes.add("Donkey Kong");

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
		System.out.println();
		
		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Super Mario");
		nomes2.add("Yoshi");
		nomes2.add("Donkey Kong");

		Iterator<String> it2 = nomes2.iterator();

		while(it2.hasNext()) {
		  System.out.println(it2.next());
		}
	}
	
}
