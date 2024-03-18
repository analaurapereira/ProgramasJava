package Curso.Aula13;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("AU au au ");
    }
    public void reagir(String frase){
        if(frase == "toma comida" || frase == "olá"){
            System.out.println("Abanar e later");
        }
        else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora){
        if(hora >12){
            System.out.println("Comer");
        }
        else{
            System.out.println("Dormir");
        }
    }
}