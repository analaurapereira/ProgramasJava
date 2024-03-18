package Aulas.Heranca;

public class Assistente extends Funcionario {
    private int horaExtra;
    private float valorHora;

    public Assistente(String name, String endereco, String cpf, float salario, int horaExtra, float valorHora) {
        super(name, endereco, cpf, salario);
        this.setHoraExtra(horaExtra);
        this.setValorHora(valorHora);
    }


    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularSalario() {
        return this.getSalario()+(this.getHoraExtra()*this.getValorHora());
    };

    @Override
    public String toString() {
        return "Assistente{" +
                "horaExtra=" + horaExtra +
                ", name='" + name + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + calcularSalario() +
                '}';
    }
}
