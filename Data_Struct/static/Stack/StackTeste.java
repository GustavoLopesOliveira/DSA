import java.util.Scanner;
public class StackTeste{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		Stack pilha = new Stack(str.length());

		boolean c = true;

		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '('){
				pilha.push('(');
			}else{
				if(!pilha.empty() && pilha.top() == '('){
					pilha.pop();
				}else{
					c = false;
				}
			}
		}

		if(!pilha.empty()) c = false;

		System.out.println(c ? "SIM" : "NAO");
		
	}
}
