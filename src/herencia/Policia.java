package herencia;

public class Policia extends Persona {

    //Atributos
    private String puesto;

    //Constructor
    public Policia(String nombre, String fechaNac, boolean sexo, String puesto) {
        super(nombre, fechaNac, sexo);
        this.puesto = puesto;
    }

    //Metodos
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void proteger() {
        System.out.println("El policia esta protegiendo el barrio");
    }

}
