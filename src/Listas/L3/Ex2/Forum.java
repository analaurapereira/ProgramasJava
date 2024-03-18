package Listas.L3.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> mensagens;

    public Forum(int id, String name, String url) {
        this.setId(id);
        this.setName(name);
        this.setUrl(url);
        this.mensagens = new ArrayList<Message>();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public List<Message> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Message> mensagens) {
        this.mensagens = mensagens;
    }

    public void novaPostagem(String text, int id, Person person) {
        this.mensagens.add(new Message(text, id, person));
    }

    public void removerItem(Message mensagem) {
        this.mensagens.remove(mensagem);
    }
}
