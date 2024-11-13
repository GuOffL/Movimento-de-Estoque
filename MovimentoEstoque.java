public class MovimentoEstoque {
    
    public static void main (String[] args) {

        ProdutoCustoAtual pca = new ProdutoCustoAtual("1", "Feijao", 60, 1.5f);

        ProdutoCustoMedio pcm = new ProdutoCustoMedio("2", "Tomate", 120, 2.5f);


        pca.mostrarDados();
        pcm.mostrarDados();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        pca.repor(100, 1.6f);
        pcm.repor(100, 2.6f);
        
        pca.mostrarDados();
        pcm.mostrarDados();
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        pca.baixar(30);
        pcm.baixar(50);

        pca.mostrarDados();
        pcm.mostrarDados();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        pcm.baixar(300);

        // pca.mostrarDados();
        // pcm.mostrarDados();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
