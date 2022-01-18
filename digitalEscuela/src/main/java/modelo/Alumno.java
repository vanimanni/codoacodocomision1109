package modelo;

/**
 *
 * @author Iacca
 */
public class Alumno {
    private int id; 
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    
    public Alumno(int id, String nombres, String apellidos, String email, String telefono){
    this.id=id;
    this.nombres=nombres;
    this.apellidos=apellidos;
    this.email=email;
    this.telefono=telefono;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
