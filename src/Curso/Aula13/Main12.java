package Curso.Aula13;

public class Main12 {
    public static void main(String[] args) {
        //Animal n = new Animal();

        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Cachorro c = new Cachorro();


        m.alimentar();
        a.alimentar();
        c.emitirSom();
        c.reagir(1);
    }
}