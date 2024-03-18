package Listas.L1.L1Ex3;

public class Produto {
   public int id;
   public String descricao;
   public int quantidade;
   public float preco;

    public Produto(int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void comprar(int x){
        this.quantidade+=x;
    }

    public void vender(int x){
        if(this.getQuantidade()<=x){
            this.quantidade-=x;
        }

        else{
            System.out.println("Produto insuficiente");
        }
    }

    public void subir(float x){
        preco+=x;
    }

    public void descer(float x){
        if(this.getPreco() >= x){
            this.preco-=x;
        }

        else{
            System.out.println("O preço não pode ser negativo");
        }
    }

    public String informacoes() {
        return "Produto{" +
                "id=" + getId() +
                ", descricao='" + getDescricao() + '\'' +
                ", quantidade=" + getQuantidade() +
                ", preco=" + getPreco() +
                '}';
    }
}