public class TesteLista {
    public static void main(String[] args) {
        // Criando uma lista com capacidade para 6 elementos
        Lista l = new Lista(6);

        // Testando inserções
        System.out.println("Inserindo elementos...");
	System.out.println("Inicio : 10");
        l.inserirInicio(10);
	l.exibir();

	System.out.println("Fim : 20");
        l.inserirFim(20);
	l.exibir();

	System.out.println("Inserir : 15 na pos : 1");
        l.inserir(15, 1);
	l.exibir();

	System.out.println("Fim : 30");
        l.inserirFim(30);
	l.exibir();
	
	System.out.println("Inicio : 5");
        l.inserirInicio(5);
	l.exibir();

	System.out.println("Inserir : 25 na pos : 3");
        l.inserir(25, 3);
	l.exibir();
        
        System.out.println("Lista após inserções:");
        l.exibir();

        // Testando remoções
        System.out.println("\nRemovendo elementos...");

	System.out.println("inicio");
        l.removerInicio();
	l.exibir();

	System.out.println("fim");
        l.removerFinal();
	l.exibir();

	System.out.println("Removendo pos 2");
        l.remover(2);
	l.exibir();

        System.out.println("Lista após remoções:");
        l.exibir();
    }
}

