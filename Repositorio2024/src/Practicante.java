public class Practicante extends Alumno{
    private String idPracticante;
    private String periodo;

    public Practicante(String idPracticante, String periodo, String idAlumno, double promedio, String nombres, String apellidos, int edad) {
        super(idAlumno, promedio, nombres, apellidos, edad);
        this.idPracticante = idPracticante;
        this.periodo = periodo;
    }

    public String getIdPracticante() {
        return idPracticante;
    }

    public void setIdPracticante(String idPracticante) {
        this.idPracticante = idPracticante;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Practicante{" + "idPracticante=" + idPracticante 
                +", Nombre del estudiante=" + super.getNombres() + ", ID del estudiante=" +  super.getIdAlumno() 
                +", Promedio del alumno=" + super.getPromedio() + ", periodo=" + periodo + '}';
    }    
}
