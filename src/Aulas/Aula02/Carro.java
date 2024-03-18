package Aulas.Aula02;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;
    public boolean motor;
    public float valorAtual;

    public Carro(String marca, String modelo, String cor, int ano, boolean motor, float valorAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.valorAtual = valorAtual;
    }

    public String apresentacao() {
        return(
                    "Carro: " +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", cor='" + cor + '\'' +
                    ", ano=" + ano +
                    ", motor=" + motor +
                    ", valorAtual=" + valorAtual
            );
    }

    public void ligar(){
        if(this.motor){
            System.out.println("Carro já está ligado");
        }

        else{
            System.out.println("Ligando carro");
            this.motor = true;
        }
    }

    public void desligar(){
        if(this.motor){
            System.out.println("Desligando carro");
        }

        else{
            System.out.println("Carro desligado");
            this.motor = false;
        }
    }
}
