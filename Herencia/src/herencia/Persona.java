
package herencia;

public class Persona {
    int id;
    int dni;
    String nombre;
    String apellido;
    String domicilo;
    String telefono;
    public Persona(){
    }

public Persona(int id, int dni, String nombre, String apellido, String domicilio, String telefono){
    this.id= id;
    this.dni= dni;
    this.nombre= nombre;
    this.apellido=apellido;
    this.domicilo= domicilio;
    this.telefono=telefono;
    
}    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilo() {
        return domicilo;
    }

    public void setDomicilo(String domicilo) {
        this.domicilo = domicilo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
