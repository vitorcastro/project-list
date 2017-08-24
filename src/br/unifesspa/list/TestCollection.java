package br.unifesspa.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection<Elemento> elementos = new ArrayList<Elemento>();
		
		elementos.add(new Elemento("Vitor"));
		elementos.add(new Elemento("JAVA"));
		
		for(Elemento elemento : elementos)
			System.out.println(elemento.getName());
		
		if (elementos.contains(new Elemento("Vitor")))
			System.out.println("Igual");
		else
			System.out.println("Diferente");
					
		Collections.sort((List<Elemento>) elementos, new ElementoComparator() );
		
		System.out.println("=-=-=-=-");
		
		for(Elemento elemento : elementos)
			System.out.println(elemento.getName());
		
	}

}
