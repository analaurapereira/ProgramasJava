package Curso.Aula05;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n){
        numConta = n;
    }

    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
        tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }

    public void setStatus(Boolean s){
        status = s;
    }
    public Boolean getStatus(){
        return status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC"){
            this.setSaldo(50);
        }

        else if(t == "CP"){
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta ainda possui dinheiro");
        }

        else if(this.getSaldo() < 0){
            System.out.println("Está em débito");
        }

        else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float d){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Depósito realizado com sucesso");
        }

        else{
            System.out.println("Não é possível depositar");
        }
    }

    public void sacar(float d){
        if(this.getStatus()){
            if(this.getSaldo() >= d) {
                this.setSaldo(this.getSaldo() - d);
                System.out.println("Saque realizado com sucesso");
            }

            else{
                System.out.println("Saldo insuficiente");
            }
        }

        else{
            System.out.println("Não é possível retirar");
        }
    }

    public void pagarMensal(){
        int v = 0;

        if(this.tipo == "CC"){
            v = 12;
        }

        else if(this.tipo == "CP") {
            v = 20;
        }

        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo pago com sucesso");
            }

            else{
                System.out.println("Saldo insuficiente");
            }
        }

        else{
            System.out.println("Não é possível retirar");
        }
    }
}