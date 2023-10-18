package herencia;

public class Estudiante extends Persona {

    //Atributos
    private double promedio;

    //Constructor
    public Estudiante(String nombre, String fechaNac, boolean sexo, double promedio){
    
    //Super sirve para tomar los atributos de la clase padre
    super(nombre, fechaNac, sexo);
    this.promedio = promedio;
    }

    //Metodos

    public double getPromedio() {
        return promedio;
    }


    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void Estudiar(String materia){
        System.out.println("El estudiante estudia: " + materia);
    }
}
