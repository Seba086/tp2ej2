package ej2tp2;

public class SimpleLinkedList {

	protected Node first;
	private Node last;
	private int size = 0;

	public SimpleLinkedList() {
		first = null;

	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insert(int s) {// INSERTA AL FINAL
												

		Node nodo = new Node(null, s);
		if (first == null) {
			first = nodo;
			last = first;
		} else {
			last.setNext(nodo);
			last = nodo;
		}
		size++;
	}

	
	public void insertElementFirstPos(int s) { //INSERTA ELEMENTO AL PRINCIPIO
		Node nodo = new Node(null, s);
		nodo.setNext(first);
		first = nodo;
		size++;
	}
	
	// ELIMINA UN NODO POR POSICION, Y VINCULA EL ANTERIOR CON EL SIGUIENTE
	public void deleteElement(int pos) {

		if (size - 1 > pos && first == null) {
			System.out.println("No borré nada"); // Si la lista esta vacía
		} else if (pos == 0) { // Si borro el primero de la lista, el segundo se
								// vuelve el primero
			first = first.getNext();
			size--;
		} else {
			if (size > pos || first == null) {
				Node nodo = elementAt(pos - 1);
				if (nodo != null) {
					nodo.setNext(nodo.getNext().getNext());
					size--;
				}
			} else
				System.out.println("No hay nada en esa posición");
		}

	}

	public Node elementAt(int pos) {
		Node nodo = null;
		if (size < pos - 1 || first == null) {
			System.out.println("No hay nada en esa posiciòn");
		} else {
			nodo = first;
			for (int i = 0; i < pos; i++) {
				nodo = nodo.getNext();
			}
		}
		return nodo;
	}

	public int getSize() {
		return size;
	}

	
	
}