package Listas.L1.L1Ex4;

public class Rio {
  public String nome;
  public float nivel;
  public boolean poluido;

  public Rio(String nome, float nivel, boolean poluido) {
    this.nome = nome;
    this.nivel = nivel;
    this.poluido = poluido;
  }

  public Rio(){}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getNivel() {
    return nivel;
  }

  public void setNivel(float nivel) {
    this.nivel = nivel;
  }

  public boolean isPoluido() {
    return poluido;
  }

  public void setPoluido(boolean poluido) {
    this.poluido = poluido;
  }

  public void chover(float x){
    setNivel(this.nivel+=x);
  }

  public void ensolarar(float x){
    if(this.getNivel() <= x){
      setNivel(this.nivel-=x);
    }

    else{
      System.out.println("O rio secou");
    }
  }

  public void limpar(){
    if(poluido){
      setPoluido(false);
      System.out.println("O rio acabou de ser limpo");
    }

    else{
      System.out.println("O rio já esta limpo");
    }
  }

  public void sujar(){
    if(poluido){
      System.out.println("O rio está sujo");
    }

    else{
      setPoluido(false);
      System.out.println("O rio foi sujado");
    }
  }

  public String mostrar() {
    return "Rio{" +
            "nome='" + nome + '\'' +
            ", nivel=" + nivel +
            ", poluido=" + poluido +
            '}';
  }
}