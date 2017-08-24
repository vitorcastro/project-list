package br.unifesspa.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Integer, Elemento> elementos = new HashMap<>();
		
		elementos.put(200, new Elemento("Vitor"));
		
		for (Entry<Integer, Elemento> elemento : elementos.entrySet())
		{
			System.out.println(elemento.getValue().getName());
			System.out.println(elemento.getKey());
		}
		
		System.out.println("Elemento:" + elementos.get(200).getName());
	}
	
}
