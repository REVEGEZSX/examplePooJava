package example1;

public class Trabajador extends Persona {

    private String ID;
    private double sueldo;

    public Trabajador(String nombre, String apellido, String CC, int edad, String ID, double sueldo) {
        super(nombre, apellido, CC, edad);
        this.ID = ID;
        this.sueldo = sueldo;
    }
    public void mostrardatos()
    {
        System.out.println("Nombre "+nombre+
                            "\nApellido "+apellido+
                            "\nCC "+CC+
                            "\nEdad "+edad+
                            "\nID "+ID+
                            "\nSueldo "+sueldo);
    }
}
