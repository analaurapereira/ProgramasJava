package Curso.Aula04;
public class Main3 {
    public static void main(String[] args) {
        Caneta3 c1 = new Caneta3("Nic", "Amarela", 0.4f);
        //c1.ponta = 0.5f; não funciona pois está como privado
        c1.status();
    }
}