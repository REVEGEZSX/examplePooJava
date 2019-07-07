package example2;

public abstract class Bar {
    protected String Bebidas;
    protected Double Valor;

    public Bar(String Bebidas, Double Valor) {
        this.Bebidas = Bebidas;
        this.Valor = Valor;
    }

    public String getBebidas() {
        return Bebidas;
    }

    public Double getValor() {
        return Valor;
    }

    public void setBebidas(String Bebidas) {
        this.Bebidas = Bebidas;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }
    
}
