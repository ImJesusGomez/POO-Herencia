package herencia;

public class Jardinero extends Persona {


    //Atributos
    private int resistencia;

    //Constructor
    public Jardinero(String nombre, String fechaNac, boolean sexo, int resistencia) {
        super(nombre, fechaNac, sexo);
        this.resistencia = resistencia;
    }
    
    //Metodos
    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public void podar(){
        System.out.println("El jardinero esta podando el jardin");
    }
}
