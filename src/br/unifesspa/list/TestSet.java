package br.unifesspa.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		
		Set<Elemento> elementos = new HashSet<Elemento>();
		
		Elemento elementoVitor = new Elemento("Vitor");
		
		elementos.add(elementoVitor);
		elementos.add(elementoVitor);
		elementos.add(new Elemento("Java"));
		elementos.add(new Elemento("CSS"));
		elementos.add(new Elemento("HTML 5"));
		
		for (Elemento elemento : elementos) 
			System.out.println(elemento.getName());
		
		System.out.println("-=-=-=-=-=-");
		
		SortedSet<Elemento> elementosOrdenados = new TreeSet<Elemento>();
		
		elementosOrdenados.add(elementoVitor);
		elementosOrdenados.add(new Elemento("CSS"));
		elementosOrdenados.add(new Elemento("HTML 5"));
		elementosOrdenados.add(new Elemento("Java"));
		
		Iterator<Elemento> iterator = elementosOrdenados.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
	}
	
}
