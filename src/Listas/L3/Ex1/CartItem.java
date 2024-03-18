package Listas.L3.Ex1;
public class CartItem {
    Produto produto;
    private int qtde;
    private int id;

    public CartItem(Produto produto, int qtde, int id) {
        this.setProduto(produto);
        this.setQtde(qtde);
        this.setId(id);
    }
    public CartItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }

        else{
            System.out.println("Valor de id_cartItem inválido");
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        if(qtde >0){
            this.qtde = qtde;
        }

        else{
            System.out.println("Quantidade inválida para " + this.getProduto().getNome());
        }
    }

    public float valor(){
        return getQtde()* produto.getPreco();
    }
}
