package ej2tp2;

public class main {

	public static void main(String[] args) {
		
		// Busca elemento en lista simple desordenada
		// Este algoritmo tiene una complejidad O(n) porque el peor de los casos es que
		// deberá recorrer todos los elementos de la lista.
		
		SimpleLinkedList lista = new SimpleLinkedList();
		BuscadorSimpleList buscador = new BuscadorSimpleList();
		lista.insertElementFirstPos(5);
		lista.insertElementFirstPos(15);
		lista.insertElementFirstPos(45);
		lista.insertElementFirstPos(25);
		lista.insertElementFirstPos(85);
		lista.insertElementFirstPos(115);
		lista.insertElementFirstPos(55);
		lista.insertElementFirstPos(65);
		lista.insertElementFirstPos(95);
		lista.insertElementFirstPos(51);
		lista.insertElementFirstPos(58);
		
		System.out.println(buscador.buscarElemento(-1, lista));
		
		
		
		// Busca elemento en arreglo ordenado ascendentemente;
		// Este otro algoritmo tiene una complejidad O(n) porque en el peor de los casos
		// deberá recorrer todo el arreglo y puede que el elemento no exista.
		BuscadorArreglo buscoNro = new BuscadorArreglo();
		int[] arreglo = new int[10];
		for(int i=0; i<10; i++){
			arreglo[i] = i;
		}
		System.out.println(buscoNro.buscarNro(10, arreglo));
	}

}
