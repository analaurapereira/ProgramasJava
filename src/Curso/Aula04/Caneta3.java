package Curso.Aula04;
public class Caneta3 {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta3(String m, String c, float p){//metodo construtor tem o mesmo nome da classe
        this.tampar();
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}