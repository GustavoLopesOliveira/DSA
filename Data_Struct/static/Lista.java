public class Lista{

	private Integer n;
	private int[] list;
	private Integer ultimo = 0;

	Lista(Integer n){
		this.n = n;
		this.list = new int[n+5];
	}
	
	//Insercao
	public void inserirInicio(Integer elem){
		for(int i = n-1; i > 0; i--){
			list[i] = list[i-1];
		}
		list[0] = elem;
		ultimo++;
	}

	public void inserirFim(Integer elem){
		if(ultimo < n){
			list[ultimo] = elem;
			ultimo++;
		}else{
			System.out.println("Esta cheio");
		}
	}

	public void inserir(Integer elem,Integer pos){
		if(pos >= 0 && pos <= ultimo){	
			for(int i = n-1; i > pos; i--){
				list[i] = list[i-1];
			}

			list[pos] = elem;
			ultimo++;
		}else{
			System.out.println("Esta cheio");
		}
	}

	//Remocao
	
	public void removerInicio(){
		if(ultimo > 0){	
			for(int i = 0; i < n-1; i++){
				list[i] = list[i+1];
			}
			ultimo--;
		}else{
			System.out.println("Esta vazia");
		}
	}

	public void removerFinal(){
		if(ultimo > 0){
			ultimo--;
		}else{
			System.out.println("Esta vazia");
		}
	}

	public void remover(Integer pos){
		if(pos >= 0 && pos <= ultimo){
			for(int i = pos; i < n-1; i++){
				list[i] = list[i+1];
			}
			ultimo--;
		}else{
			System.out.println("Posicao Invalida");
		}
	}

	//Mostrar
	public void exibir() {
		System.out.print("Lista: ");

    		for (int i = 0; i < ultimo; i++) {
        		System.out.print(list[i] + " ");
   	 	}

    		System.out.println();
	}

}
