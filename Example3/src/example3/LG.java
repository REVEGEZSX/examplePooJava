package example3;

public class LG extends smartphone {
    private String modelo;

    public LG(String modelo, String imei, String añoFabricacion) {
        super(imei, añoFabricacion);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String Mostrarinfo()
    {
        return "IMEI: "+imei+"\nañoFabricacion:  "+añoFabricacion+"\nMODELO "+modelo;
    }
}
