public class FilaCircular{
	private int[] array;
	private int primeiro;
	private int ultimo;

	FilaCircular(){
		this.primeiro = 0;
		this.ultimo = 0;
		array = new int[10];
	}

	FilaCircular(int tam){
		this.primeiro = 0;
		this.ultimo = 0;
		array = new int[tam];
	}

	public void push(int elem) throws Exception{
		if( ((ultimo + 1) % array.length) == primeiro){
			throw new Exception("Esta cheio");
		}

		array[ultimo] = elem;
		ultimo = (ultimo + 1) % array.length;
	}

	public void pop() throws Exception{
		if(ultimo == primeiro){
			throw new Exception("Está vazio");
		}

		primeiro = (primeiro + 1) % array.length;
	}

	public int front() throws Exception{
		if(ultimo == primeiro) throw new Exception("Está vazio");

		return array[primeiro];
	}

	public static void main(String[] args){
		
		try{
		FilaCircular fila = new FilaCircular(10000);

		for(int i = 1; i < 10000; i++){
			fila.push(i);
		}

		for(int i = 0; i < 10000; i++){
			System.out.print(fila.front() + " ");
			fila.pop();
		}

		System.out.println();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
