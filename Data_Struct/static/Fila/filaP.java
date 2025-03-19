public class filaP {

    class Paciente {
        public String nome;
        public int prioridade;

        public Paciente(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }
    }

    class FilaPrioridade {

        private Paciente[] itens;
        private int n;

        public FilaPrioridade(int tam) {
            this.n = 0;
            itens = new Paciente[tam];
        }

        public void inserir(Paciente p) {
            if (n == 0) {
                itens[n] = p;
                n++;
                return;
            }

            if (n >= itens.length) {
                System.out.println("Fila cheia");
                return;
            }

            int pos = n;
            for (int i = 0; i < n; i++) {
                if (itens[i].prioridade > p.prioridade) {
                    pos = i;
                    break;  // Agora interrompe corretamente
                }
            }

            for (int i = n; i > pos; i--) {
                itens[i] = itens[i - 1];
            }

            itens[pos] = p;
            n++;
        }

        public Paciente remover() {
            if (n == 0) {
                System.out.println("Fila vazia");
                return null;
            }

            Paciente p = itens[0];

            for (int i = 0; i < n - 1; i++) {
                itens[i] = itens[i + 1];
            }

            n--;
            return p;
        }

        public void exibir() {
            if (n == 0) {
                System.out.println("Fila vazia");
                return;
            }
            System.out.println("Fila de Prioridade:");
            for (int i = 0; i < n; i++) {
                System.out.println(itens[i].nome + " - Prioridade: " + itens[i].prioridade);
            }
        }
    }

    public static void main(String[] args) {
        filaP programa = new filaP();
        FilaPrioridade fila = programa.new FilaPrioridade(5);

        fila.inserir(programa.new Paciente("Ana", 2));
        fila.inserir(programa.new Paciente("Carlos", 1));
        fila.inserir(programa.new Paciente("Bia", 3));

        fila.exibir();

        System.out.println("\nRemovendo: " + fila.remover().nome);
        fila.exibir();
    }
}

