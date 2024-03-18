package Listas.L3.Ex1;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<CartItem> itens;
    private int id;

    public Cart(int id) {
        this.itens = new ArrayList<CartItem>();
        this.setId(id);
    }
    public Cart() {
    }

    public List<CartItem> getItens() {
        return itens;
    }

    public void setItens(List<CartItem> itens) {
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }

        else{
            System.out.println("Valor de id_cart inválido");
        }
    }

    public void adicionarItem(int id, int qtde, Produto produto) {
        this.itens.add(new CartItem(produto, qtde, id));
    }

    public void removerItem(CartItem item) {
        this.itens.remove(item);
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (CartItem item : itens) {
            total += item.valor();
        }
        return total;
    }
}
