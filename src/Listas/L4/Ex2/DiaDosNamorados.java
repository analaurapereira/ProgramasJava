package Listas.L4.Ex2;

public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("\nFeliz dia dos namorados, "+this.getDestinatario());
    }
}
