public abstract class Produto {

    private String codigo;
    private String nome;
    private int quantidade;
    private float custo;


    public Produto(String codigo, String nome, int quantidade, float custo){

        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;

    }

    public float getValEstoque () {
        return this.quantidade * this.custo;
    }

    public void repor (int quant, float custoUnitario) {
        this.quantidade += quant;
    }

    public boolean validarSaldo (int quant) {
        return (quant <= this.quantidade);
    }

    public void baixar (int quant) {
        
        if (this.validarSaldo(quant)) {
            this.quantidade -= quant;
        } else {
            System.out.println(" Quantidade em estoque nao bate com a validacao!!!");
        }
    }

    public void mostrarDados () {
        System.out.printf(" cod: %s\n nome: %s\n quantidade: %d\n custo: R$%.2f\n Valor no Estoque: R$%.2f\n\n", this.codigo, this.nome, this.quantidade, this.custo, getValEstoque());
    }   

    // Gets and Seters

    public String getCodigo() {
        return codigo;
    }
    public float getCusto() {
        return custo;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
