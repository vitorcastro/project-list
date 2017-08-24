package br.unifesspa.list;

import java.util.Comparator;

public class ElementoComparator implements Comparator<Elemento> {

	@Override
	public int compare(Elemento o1, Elemento o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}

}
