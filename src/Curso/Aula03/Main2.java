package Curso.Aula03;

public class Main2 {
    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();
        c1.modelo = "BIC";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
}