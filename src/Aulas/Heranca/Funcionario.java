package Aulas.Heranca;

public abstract class Funcionario {
    protected String name;
    protected String endereco;
    protected String cpf;
    protected float salario;

    public Funcionario(String name, String endereco, String cpf, float salario) {
        this.setName(name);
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setSalario(salario);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaSalario(){
        return 0;
    }

    public abstract float calcularSalario();
}
