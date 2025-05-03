public class LinkedList {
    private class No {
        Integer data;
        No next;

        No() {
            data = 0;
            next = null;
        }

        No(Integer data) {
            this.data = data;
            next = null;
        }
    }

    private No head;
    private No tail;

    public LinkedList() {
        head = new No();
        tail = head;
    }

    // --- Inserção ---
    public void inserirInicio(int elem) {
        No tmp = new No(elem);
        tmp.next = head.next;
        head.next = tmp;
        if (head == tail) {
            tail = tmp;
        }
    }

    public void inserirFinal(int elem) {
        No tmp = new No(elem);
        tail.next = tmp;
        tail = tmp;
    }

    public void inserir(int elem, int pos) {
        if (pos == 0) {
            inserirInicio(elem);
            return;
        }

        int tamanho = tamanho();
        if (pos >= tamanho) {
            inserirFinal(elem);
            return;
        }

        No atual = head;
        for (int i = 0; i < pos; i++) {
            atual = atual.next;
        }
        No tmp = new No(elem);
        tmp.next = atual.next;
        atual.next = tmp;
    }

    // --- Remoção ---
    public int removerInicio() {
        if (head == tail) return -1;
        No tmp = head.next;
        head.next = tmp.next;
        int ans = tmp.data;
        if (tmp == tail) {
            tail = head;
        }
        tmp = null;
        return ans;
    }

    public int removerFim() {
        if (head == tail) return -1;
        No atual = head;
        while (atual.next != tail) {
            atual = atual.next;
        }
        int ans = tail.data;
        atual.next = null;
        tail = atual;
        return ans;
    }

    public int remover(int pos) {
        if (pos == 0) {
            return removerInicio();
        }

        int tamanho = tamanho();
        if (pos >= tamanho) {
            return removerFim();
        }

        No atual = head;
        for (int i = 0; i < pos; i++) {
            atual = atual.next;
        }
        No tmp = atual.next;
        atual.next = tmp.next;
        int ans = tmp.data;
        if (tmp == tail) {
            tail = atual;
        }
        tmp = null;
        return ans;
    }

    // --- Auxiliares ---
    private int tamanho() {
        int count = 0;
        No atual = head.next;
        while (atual != null) {
            count++;
            atual = atual.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.inserirFinal(10);
        lista.inserirInicio(5);
        lista.inserir(7, 1);
        System.out.println(lista.remover(1));
    }
}
