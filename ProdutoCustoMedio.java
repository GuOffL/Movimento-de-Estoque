public class ProdutoCustoMedio extends Produto{
    
    public ProdutoCustoMedio(String codigo, String nome, int quantidade, float custo) {
        super(codigo, nome, quantidade, custo);
    }

    public void repor(int quant, float val) {
        this.setCusto((this.getValEstoque() + (quant * val)) / (this.getQuantidade() + quant));;
        super.repor(quant, val);
    }

}
