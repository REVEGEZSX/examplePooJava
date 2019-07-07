package example2;

public abstract class Aleman extends Bar{
    private String mesa;
    private String snack;

    public Aleman(String mesa, String snack, String Bebidas, Double Valor) {
        super(Bebidas, Valor);
        this.mesa = mesa;
        this.snack = snack;
    }
    
}
