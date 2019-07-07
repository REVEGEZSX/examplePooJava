package example3;

public class smartphone {
    protected String imei;
    protected String añoFabricacion;

    public smartphone(String imei, String añoFabricacion) {
        this.imei = imei;
        this.añoFabricacion = añoFabricacion;
    }

    public String getImei() {
        return imei;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    public String Mostrarinfo()
    {
        return "\nIMEI: "+imei+"\nañoFabricacion:  "+añoFabricacion;
    }
    
}
