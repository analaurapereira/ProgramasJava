package Listas.L1.L1Ex2;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor) {
        this.saldo += valor;
    }

    public void realizarSaque(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }

        else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String obterDadosCliente() {
        return "Número da Conta: " + numeroConta +
                "\nNome: " + nome +
                "\nSaldo Atual: " + saldo;
    }
}