package Listas.L1.L1Ex2;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(735, 578, "Fulano", 10.0f);
      Cliente c2 = new Cliente(6734, 1367, "Beltrano", 12.0f);

        c1.realizarDeposito(1.0f);
        c1.realizarSaque(3.0f);
        System.out.println("Dados do Cliente Fulano:\n" + c1.obterDadosCliente());


        c2.realizarDeposito(2.0f);
        c2.realizarSaque(4.0f);
        System.out.println("\nDados do Cliente Beltrano:\n" + c2.obterDadosCliente());
    }
}