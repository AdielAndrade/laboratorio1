package maximo;

public class funcaoMaximo {
	
	
	public int procuraMaximo(int[] array){
		int maximo =array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo){
				maximo = array[i];
			}
		}
		return maximo;
	}



}
