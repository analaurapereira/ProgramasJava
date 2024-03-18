package Aulas.Associacao;

public class Produto {
    private String nome;
    private int id;
    private float preco;

    public Produto(String nome, float preco, int id) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setId(id);
    }
    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }

        else{
            System.out.println("Valor de id_produto inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco > 0){
            this.preco = preco;
        }

        else{
            System.out.println("Preço inválido, tente novamente");
        }

    }
}
