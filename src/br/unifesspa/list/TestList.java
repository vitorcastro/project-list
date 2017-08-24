package br.unifesspa.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List<Elemento> elementos = new ArrayList<Elemento>();
		
		Elemento elemento = new Elemento("Vitor");
		
		elementos.add(elemento);
		
		elementos.add(new Elemento("JSF"));
		
		elementos.add(new Elemento("CSS"));
		
		for (int indexLista = 0; indexLista < elementos.size(); indexLista++) 
			System.out.println(elementos.get(indexLista).getName());
		
		System.out.println(elementos.contains(elemento));
		
		Iterator<Elemento> iterator = elementos.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
	}
	
}
