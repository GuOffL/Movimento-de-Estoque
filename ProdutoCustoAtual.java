class ProdutoCustoAtual extends Produto {
    
    public ProdutoCustoAtual (String codigo, String nome, int quantidade, float custo) {
        super(codigo, nome, quantidade, custo);
    }

    public void repor(int quant, float val) {
        setCusto(val);
        super.repor(quant, val);
    }
}