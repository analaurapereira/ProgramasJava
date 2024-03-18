package Listas.L3.Ex2;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private int id;
    private String name;
    private String user;
    private static Set<String> existingUsers = new HashSet<>();


    public Person(int id, String name, String user) {
        this.setId(id);
        this.setName(name);
        if (isUsernameAvailable(user)) {
            this.setUser(user);
            existingUsers.add(user);
        }
        else {
            System.out.println("Nome de usuário já existe.");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        }

        else{
            System.out.println("Id inválido");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public static boolean isUsernameAvailable(String username) {
        return !existingUsers.contains(username);
    }

}
