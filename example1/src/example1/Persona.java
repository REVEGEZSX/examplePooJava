package example1;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String CC;
    protected int edad;
    public Persona(String nombre, String apellido, String CC,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCC() {
        return CC;
    }
    public int getEdad() {
        return edad;
    }    
}
