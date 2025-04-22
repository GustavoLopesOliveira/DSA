package Data_Struct.flex.Stack;

public class Stack{

    private Cel top = null;

    public void push(int elem){
        Cel tmp = new Cel(elem);
        tmp.next = top.next;
        top.next = tmp;
    }

    public void pop(){
        if(top != null)
        top.next = top.next.next;
    }

    public int top(){
        return top.next.elem;
    }

    public static void main(String[] args){
        Stack pilha = new Stack();
        pilha.push(5);
        pilha.push(12);
        pilha.push(29);
        pilha.pop();
        pilha.top();
        pilha.push(-1);
    }
}

class Cel{
    Integer elem;
    Cel next;

    Cel(){
        elem = null;
        next = null;
    }

    Cel(int e){
        elem = e;
        next = null;
    }
}