package Listas.L1.L1Ex3;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto(29, "bola azul", 3, 45.90f);

        p1.setId(18);
        p1.setQuantidade(7);
        p1.setDescricao("corda rosa");
        p1.setPreco(20.0f);

        p2.vender(3);
        p2.subir(2.50f);

        System.out.println(p1.informacoes());
        System.out.println(p2.informacoes());

    }
}