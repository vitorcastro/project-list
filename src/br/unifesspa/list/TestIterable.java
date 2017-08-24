package br.unifesspa.list;

import java.util.ArrayList;
import java.util.List;

public class TestIterable {

	public static void main(String[] args) {
		
		List<Elemento> elementos = new ArrayList<Elemento>();
		elementos.add(new Elemento("Vitor"));
		
		Iterable<Elemento> iterableElementos = elementos;
		
		for(Elemento elemento : iterableElementos)
			System.out.println(elemento.getName());
		
	}
	
}
