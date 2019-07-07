package example2;

public abstract class Japones extends Bar{
    protected String cabinas;
    protected String plato;

    public Japones(String Bebidas, Double Valor, String cabinas, String plato) {
        super(Bebidas, Valor);
        this.cabinas = cabinas;
        this.plato = plato;
    }
}
