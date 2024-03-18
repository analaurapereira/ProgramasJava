package Listas.L2.Ex1;

public class Cliente {
    private String numConta;
    private String numAgencia;
    private String nome;
    private float saldo;

    public Cliente(String numConta, String numAgencia, String nome, float saldo) {
        setNumConta(numConta);
        setNumAgencia(numAgencia);
        setNome(nome);
        setSaldo(saldo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numConta='" + numConta + '\'' +
                ", numAgencia='" + numAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        if (numConta.length() == 8 && numConta.charAt(6) == '-') {
            this.setNumConta(numConta);
        }

        else {
            System.out.println("Número da conta inválido. Tente novamente");
        }
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        if (numAgencia.length() == 6 && numAgencia.charAt(4) == '-') {
            this.setNumAgencia(numAgencia);
        }

        else {
            System.out.println("Número de agência inválido. Tente novamente");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.setNome(nome);
        }

        else {
            System.out.println("Nome muito longo");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.setSaldo(saldo);
        }

        else {
            System.out.println("Saldo não pode ser negativo");
        }
    }

    public void realizarDeposito(float valorDeposito) {
        if (valorDeposito > 0) {
            this.setSaldo(saldo += valorDeposito);
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + this.getSaldo());
        }

        else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void realizarSaque(float valorSaque) {
        if (valorSaque > 0 && valorSaque <= this.getSaldo()) {
            this.setSaldo(saldo-= valorSaque);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + this.getSaldo());
        }

        else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}