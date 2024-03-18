package Curso.Aula03;

public class Caneta2 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada) {
            System.out.println("Erro. Não posso rabiscar");
        }

        else{
            System.out.println("Estou rabiscando.");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
}