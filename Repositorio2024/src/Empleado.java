public class Empleado {
    int id;
    String nombre;
    double sueldo;

    Empleado() {
        id = 0;
        nombre = "";
        sueldo = 0.0;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }

    public Empleado(int id, String nombre, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    Empleado empleado1 = new Empleado();
     Empleado empleado = new Empleado(1,"JuanPerz",1000.00);

    }