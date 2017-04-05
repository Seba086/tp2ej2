package ej2tp2;

public class BuscadorSimpleList {

	private boolean answer = false;

	public boolean buscarElemento(int nro, SimpleLinkedList lista) {
		if (lista.elementAt(0) != null) {
			return buscarRecursivo(nro, lista.elementAt(0));
		} else {
			return false;
		}
	}

	private boolean buscarRecursivo(int nro, Node nodo) {
		if (nodo.getInfo() == nro) {
			answer = true;
		} else if (nodo.getNext() != null) {
			buscarRecursivo(nro, nodo.getNext());
		} else {
			answer = false;
		}
		return answer;
	}
}
