public class Stack{
	protected Integer size;
	protected Integer last;
	protected char[] vet;

	Stack(Integer size){
		this.size = size;
		vet = new char[size];
		last = -1;
	}

	public boolean empty(){
		if(last == -1) return true;
		return false;
	}

	public Integer size(){
		return last + 1;
	}

	public void push(char elem){
		if(last < size - 1){	
			vet[last+1] = elem;
			last++;
		}else{
			System.out.println("Está cheio");
		}
	}

	public void pop(){
		if(last >= 0){
			last--;
		}else{
			System.out.println("Está vazio");
		}
	}

	public void info(){
		
		for(int i = 0; i <= last; i++){
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i = 0; i <= last; i++){
			System.out.print(vet[i] + " ");	
		}
		System.out.println();
	}

	public char top(){
		if(last != -1){
			return vet[last];
		}
		return '\0';
	}
}
