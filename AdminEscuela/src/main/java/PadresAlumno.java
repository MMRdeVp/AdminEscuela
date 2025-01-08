public class PadresAlumno {

    private String Nombre;
    private String Apellidos;
    private int Telefono;
    private String Email;

    public PadresAlumno(String Nombre, String Apellidos, int Telefono, String Email) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String toString() {
        return this.getNombre() + " " + this.getApellidos() + "\nTelefono: " + this.getTelefono() + "\nEmail: " + this.getEmail();
    }
}
