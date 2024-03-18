package Aulas.Heranca;

public class Diretor extends Funcionario{
    private float acoesEmpresa;
    public Diretor(String name, String endereco, String cpf, float salario, float acoesEmpresa) {
        super(name, endereco, cpf, salario);
        this.setAcoesEmpresa(acoesEmpresa);
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public float calcularSalario() {
        return this.getSalario()+this.getAcoesEmpresa();
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "acoesEmpresa=" + acoesEmpresa +
                ", name='" + name + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + calcularSalario() +
                '}';
    }
}
