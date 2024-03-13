/**
 *
 * @author Omar Gerardo P�rez Morales
 * @version 1.0
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;

    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /*public Persona(Persona persona) {
        this.nombres = persona.getNombres();
        this.apellidos = persona.getApellidos();
        this.edad = persona.edad;
    }*/

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
}
