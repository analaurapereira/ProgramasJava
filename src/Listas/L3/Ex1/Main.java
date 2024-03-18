package Listas.L3.Ex1;
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 30.25f, 123);
        Produto p2 = new Produto("Produto 2", 67.00f, 193);
        Produto p3 = new Produto("Produto 3", 54.50f, 199);

        Cart c1 = new Cart(124);
        Cart c2 = new Cart(126);

        c1.adicionarItem(1234, 2, p1);
        c1.adicionarItem(321, 5, p2);

        c2.adicionarItem(321, 3, p2);
        c2.adicionarItem(199, 1, p3);

        System.out.println();

        System.out.println("Produtos comprados no carrinho de id " + c1.getId() +": ");
        for (CartItem item : c1.getItens()) {
            System.out.println("- " + item.getProduto().getNome() + ": " + item.getQtde() + " unidades X " + item.getProduto().getPreco()+". Valor: " + item.valor());
        }
        System.out.println("Total da compra: R$" + c1.calcularTotal());

        System.out.println();

        System.out.println("Produtos comprados no carrinho de id " + c2.getId() +": ");
        for (CartItem item : c2.getItens()) {
            System.out.println("- " + item.getProduto().getNome() + ": " + item.getQtde() + " unidades X " + item.getProduto().getPreco()+". Valor: " + item.valor());
        }
        System.out.println("Total da compra: R$" + c2.calcularTotal());
    }
}