package Listas.L3.Ex2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(123, "joão","joao123");
        Person p2 = new Person(125, "carlos","carlinhosM");
        Person p3 = new Person(876, "joana", "joaninha32");

        Forum f1 = new Forum(23, "twitter", "www.twitter.com");
        Forum f2 = new Forum(256, "instagram", "www.instagram.com");

        f1.novaPostagem("to com sono", 123, p1);
        f1.novaPostagem("turma do pagode!!!", 24, p2);

        f2.novaPostagem("Só um pagode...", 133, p2);
        f2.novaPostagem("Assa casa é minha, não da mãe joana", 22, p3);

        System.out.println();
        System.out.println("Postagems de hoje no " + f1.getName()+": \n");
        for (Message mensagens : f1.getMensagens()) {
            System.out.println(mensagens.getText());
            System.out.println("Escrito por: " + mensagens.getPerson().getUser()+"\n");
        }
        System.out.println("---------------------------");
        System.out.println("Postagems de hoje no " + f2.getName()+": \n");
        for (Message mensagens : f2.getMensagens()) {
            System.out.println(mensagens.getText());
            System.out.println("Escrito por: " + mensagens.getPerson().getUser()+"\n");
        }
    }
}