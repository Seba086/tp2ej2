package ej2tp2;

public class BuscadorArreglo {
	int i = 0;
	int[] arr;
	int answer = -1;
	public int buscarNro(int nro, int[] arreglo){
		if (arreglo.length !=0){
			arr = arreglo; // arr apunta a arreglo
			return buscarRecursivo(nro, i);
		}
		return -1;
	}
	
	private int buscarRecursivo(int nro, int pos){
	
		if (pos<arr.length){
			if (arr[pos] == nro){
				answer = pos;
			}
			else {
				buscarRecursivo(nro, pos+1);
			}
		}
		else {
			answer = -1;
		}
		return answer;
	}
	
}
