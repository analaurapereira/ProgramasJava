package Aulas.Associacao;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> itens;
    private int id;

    public Cart(int id) {
        this.itens = new ArrayList<>();
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

    public void adicionarItem(CartItem item) {
        this.itens.add(item);
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
