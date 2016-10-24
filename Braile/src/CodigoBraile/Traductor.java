package CodigoBraile;
public class Traductor implements Imprime{

    private String Msj;

    public Traductor(String Msj) {
        this.Msj = Msj;
    }

    public String getMsj() {
        return Msj;
    }

    public void setMsj(String Msj) {
        this.Msj = Msj;
    }

    @Override
    public void imprimir() {
        System.out.println("Traduccion de : "+Msj);
        
    }
    
}
