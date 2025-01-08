import java.util.Date;

public class Alumno extends Usuario {

    private PadresAlumno padresAlumno;
    private Boolean Amonestaciones;
    private Curso Matricula;

    public Alumno(String nombre, String apellidos, PadresAlumno padresAlumno, Boolean Amonestaciones, Curso Matricula) {
        super(nombre, apellidos);
        this.padresAlumno = padresAlumno;
        this.Amonestaciones = Amonestaciones;
        this.Matricula = Matricula;

    }

    public PadresAlumno getPadresAlumno() {
        return padresAlumno;
    }

    public Boolean getAmonestaciones() {
        return Amonestaciones;
    }

    public Curso getMatricula() {
        return Matricula;
    }

    public void setPadresAlumno(PadresAlumno padresAlumno) {
        this.padresAlumno = padresAlumno;
    }

    public void setAmonestaciones(Boolean Amonestaciones) {
        this.Amonestaciones = Amonestaciones;
    }

    public void setMatricula(Curso Matricula) {
        this.Matricula = Matricula;
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + super.getApellidos()+
                "\n-----------------------\nTutor: " + this.padresAlumno.toString() + "\n-----------------------\nAmonestaciones: " + Amonestaciones + "\tMatricula: " + Matricula;
    }

}
