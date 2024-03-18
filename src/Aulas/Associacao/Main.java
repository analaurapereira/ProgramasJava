package Aulas.Associacao;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 30.25f, 123);
        Produto p2 = new Produto("Produto 2", 67.34f, 193);

        CartItem i1 = new CartItem(p1, 2, 56);
        CartItem i2 = new CartItem(p2, 5, 52);

        Cart c1= new Cart(123);

        c1.adicionarItem(i1);
        c1.adicionarItem(i2);

        System.out.println("Total da compra: R$" + c1.calcularTotal());
        System.out.println("Produtos comprados: ");
        for (CartItem item : c1.getItens()) {
            System.out.println("- " + item.getProduto().getNome() + ": " + item.getQtde() + " unidades");
        }
    }
}