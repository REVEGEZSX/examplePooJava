package example2;
import java.util.ArrayList;
public class ShinjukuBar extends Japones{
    private String acompañante;
    public ShinjukuBar(String acompañante, String Bebidas, Double Valor, String cabinas, String plato) {
        super(Bebidas, Valor, cabinas, plato);
        this.acompañante = acompañante;
    }

    public String getAcompañante() {
        return acompañante;
    }

    public void setAcompañante(String acompañante) {
        this.acompañante = acompañante;
    }
    
    public void mostrar()
    {
        System.out.println(
                "Acompañante: "+acompañante+
                "\nBebida: "+Bebidas+
                "\nCoste: "+Valor+
                "\nCabina: "+cabinas+
                "\nPlato: "+plato
                );
    }
}
