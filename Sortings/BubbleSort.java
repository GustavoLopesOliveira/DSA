public class BubbleSort{

	public static void bubble(int[] v, int tam){
		for(int i = 0; i < tam; i++){
			for(int j = 0; j < tam - 1; j++){
				if(v[j] > v[j+1]){
					int temp = v[j];
					v[j] = v[j+1];
					v[j+1] = temp;
				}
			}	
		}
	}

	public static void main(String[] args){
		int[] v = new int[10];

		for(int i = 0; i < 10; i++){
			v[i] = 10-i;
		}

		bubble(v,10);

		for(int i = 0; i < 10; i++){
			System.out.print(v[i] + " ");
		}
	}
}


