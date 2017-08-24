package br.unifesspa.list;

public class TestArray {
	
	public static void main(String[] args) {
		
		//Condição para a utilização do Array
		// - Tamanho fixo
		// - Acesso direto
		
		Elemento[] arrayElementos = new Elemento[10];
		
		Elemento elemento = new Elemento("Vitor");
		
		arrayElementos[0] = elemento;
		arrayElementos[1] = elemento;
		
		elemento.setName("JSF");
		
		System.out.println(arrayElementos[0].getName());
		System.out.println(arrayElementos[1].getName());
		
	}

}
