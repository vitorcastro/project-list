package br.unifesspa.list;

import java.util.Comparator;

public class Elemento implements Comparable {
	
	public Elemento(String name) {
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	private String name;
	
	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		
		Elemento elemento = (Elemento) obj;
		return (this.name == elemento.getName());
	}

	@Override
	public int compareTo(Object obj) {
		Elemento elemento = (Elemento) obj;
		return this.getName().compareTo(elemento.getName());
	}

}
