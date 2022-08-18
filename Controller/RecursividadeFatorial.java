package Controller;

public class RecursividadeFatorial {

	public RecursividadeFatorial() {
		// TODO Auto-generated constructor stub
	}
	
	public int RecursividadeFatorial(int numero) {
		if (numero < 2) {
			return 1;
		} else {
			return numero * RecursividadeFatorial(numero - 1);			
		}
	}
}
