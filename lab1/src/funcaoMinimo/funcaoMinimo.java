package funcaoMinimo;

public class funcaoMinimo {

	public int procuraMinimo(int[] array){
		int minimo =array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo){
				minimo = array[i];
			}
		}
		return minimo;
	}
}
