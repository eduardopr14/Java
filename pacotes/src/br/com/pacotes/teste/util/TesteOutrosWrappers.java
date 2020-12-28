package br.com.pacotes.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);     // autoboxing
		System.out.println(idadeRef.doubleValue()); // unboxing
		
		Double dRef1 = 3.2;
		Double dRef2 = new Double(3.2);		// Os 3 são autoboxing -> Diferentes jeitos de fazer manualmente
		Double dRef3 = Double.valueOf(3.2);
		
		System.out.println(dRef3.doubleValue()); // unboxing
		
		// -------------------------------------------------------------------------------------------------
		
		Boolean bRef1 = Boolean.TRUE;
		Boolean bRef2 = Boolean.FALSE;
		
		System.out.println(bRef2.booleanValue());
		
		// -------------------------------------------------------------------------------------------------
		
		Number refNumero1 = Integer.valueOf(29);
		Number refNumero2 = Double.valueOf(29);
		Number refNumero3 = Float.valueOf(29f);
		
		// -------------------------------------------------------------------------------------------------
		
		List<Number> lista = new ArrayList<>(); // <Number> é o mais genérico, aceita int, double, float
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);
		
	}
	
}
