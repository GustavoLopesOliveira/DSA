public class HeapSort {
    private int[] array;
    private int n;

    public HeapSort(int[] array) {
        this.array = array;
        this.n = array.length;
    }

    // Troca dois elementos do array
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Encontra qual filho é maior (esquerdo ou direito)
     * Usado para descer o elemento na reconstrução do heap
     */
    private int getMaiorFilho(int i, int tamHeap) {
        int filhoEsq = 2 * i;
        int filhoDir = 2 * i + 1;
        
        // Se não tem filho direito ou o esquerdo é maior
        if (filhoDir > tamHeap || array[filhoEsq] > array[filhoDir]) {
            return filhoEsq;
        } else {
            return filhoDir;
        }
    }

    /**
     * Ajusta o heap subindo - usado na construção inicial
     * Coloca o elemento na posição correta subindo na árvore
     */
    private void construir(int tamHeap) {
        for (int i = tamHeap; i > 1 && array[i] > array[i/2]; i = i/2) {
            swap(i, i/2);
        }
    }

    //private void construir(int tamHeap,int i) {
    //   if(i > 1 && array[i] > array[i/2]){
    //        swap(i, i/2);
    //        construir(tamHeap, i/2);
    //    }
    //}
    
    /**
     * Reorganiza o heap após remover a raiz
     * Pega o último elemento, coloca na raiz e vai descendo
     * até encontrar a posição correta
     */
    private void reconstruir(int tamHeap) {
        int i = 1;  // Começa na raiz
        while (i <= tamHeap/2) {  // Enquanto tiver filhos
            int filho = getMaiorFilho(i, tamHeap);
            if (array[i] < array[filho]) {
                swap(i, filho);  // Troca com o filho maior
                i = filho;      // Continua descendo
            } else {
                break;
            }
        }
    }

    /**
     * Ordena o array usando HeapSort em 2 passos:
     * 1. Constrói o heap máximo
     * 2. Extrai os elementos do heap em ordem
     */
    public void sort() {
        // Cria heap com índice 1 (facilita cálculos)
        int[] heap = new int[n + 1];
        System.arraycopy(array, 0, heap, 1, n);
        this.array = heap;
        
        // Passo 1: Construir o heap máximo
        for (int tamHeap = 2; tamHeap <= n; tamHeap++) {
            construir(tamHeap);
        }
   
        // Passo 2: Ordenação - extrai elementos do heap
        int tamHeap = n;
        while (tamHeap > 1) {
            swap(1, tamHeap);  // Move maior pro final
            tamHeap--;
            reconstruir(tamHeap);  // Reorganiza o heap
        }
   
        // Copia de volta para o array original
        System.arraycopy(array, 1, array = new int[n], 0, n);
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        HeapSort hs = new HeapSort(arr);
        hs.sort();
        hs.printArray();   
    }
}