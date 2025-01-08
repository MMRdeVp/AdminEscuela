import java.util.Date;

public class Usuario {

    //USUARIO: nombre, apellidos, dirección, fecha nacimiento.

    private String nombre;
    private String apellidos;


    public Usuario(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
