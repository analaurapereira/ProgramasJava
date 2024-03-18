package Listas.L3.Ex2;

public class Message {
    private String text;
    private int id;
    Person person;

    public Message(String text, int id, Person person) {
        this.setText(text);
        this.setId(id);
        this.setPerson(person);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
