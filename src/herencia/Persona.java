package herencia;

public class Persona {

    //Atributos
    private String nombre;
    private String fechaNac;
    private boolean sexo;

    //Constructor
    public Persona(String nombre, String fechaNac, boolean sexo) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}
