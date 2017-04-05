package ej2tp2;

public class Node {

	private int info;
	private Node next;
	
	public Node(Node n, int st, int num) {
		next = n;
		info = st;
	}


	public Node(Node n, int i) {
		next = n;
		info = i;
	}

	public void setInfo(int st) {
		info = st;
	}

	public void setNext(Node i) {
		next = i;
	}

	public int getInfo() {
		return info;
	}

	public Node getNext() {
		return next;
	}

	public void printNodeByInfo(){
		System.out.println(info);
	}
}