public class FilaLinear{
	
	int n = 0;
	int[] array;

	FilaLinear(int max){
		array = new int[max];
	}

	public void push(int elem){
		array[n] = elem;
		n++;
	}

	public void pop(){
		if(n > 0){
			for(int i = 0; i < n-1; i++){
				array[i] = array[i+1];
			}
			n--;
		}
	}

	public boolean search(int elem){
		for(int i = 0; i < n; i++){
			if(array[i] == elem) return true;
		}

		return false;
	}

	public void info(){
		for(int i = 0; i < n; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		FilaLinear queue = new FilaLinear(15);

		for(int i = 0; i < 15; i++){
			queue.push(i);
		}

		queue.info();

		for(int i = 0; i < 15; i++){
			queue.pop();
			queue.info();
		}
	}
}
