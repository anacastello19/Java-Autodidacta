
package herencia;

public class Jefe extends Persona {
    int id_jefe;
    String depto_jefe;
    
    public Jefe(){
    }

    public Jefe(int id_jefe, String depto_jefe) {
        this.id_jefe = id_jefe;
        this.depto_jefe = depto_jefe;
    }

    public Jefe(int id_jefe, String depto_jefe, int id, int dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.depto_jefe = depto_jefe;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepto_jefe() {
        return depto_jefe;
    }

    public void setDepto_jefe(String depto_jefe) {
        this.depto_jefe = depto_jefe;
    }
    
    
}
