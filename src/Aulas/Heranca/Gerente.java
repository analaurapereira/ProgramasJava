package Aulas.Heranca;

public class Gerente extends Funcionario{

    private float bonus;

    public Gerente(String name, String endereco, String cpf, float salario, float bonus) {
        super(name, endereco, cpf, salario);
        this.setBonus(bonus);
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calcularSalario() {
        return this.getSalario()+this.getBonus();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + calcularSalario() +
                '}';
    }
}
