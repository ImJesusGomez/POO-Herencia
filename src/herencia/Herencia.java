package herencia;

public class Herencia {

    public static void main(String[] args) {

        //Creamos un objeto tipo estudiante
        Estudiante e = new Estudiante("Pancho Pantero", "17/Oct/03", true, 9.0);

        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Fecha de Nacimiento: " + e.getFechaNac());

        if (e.isSexo()) {
            System.out.println("Sexo: Hombre");
        } else {
            System.out.println("Sexo: Mujer");
        }

        System.out.println("Promedio: " + e.getPromedio());

        e.Estudiar("Electronica");

        System.out.println("-------------------------------------------------");

        //Creamos un objeto tipo policia
        Policia poli = new Policia("Kerry", "10/12/2002", true, "Rango Mayor");

        System.out.println("DATOS DEL POLICIA");
        System.out.println("Nombre: " + poli.getNombre());
        System.out.println("Fecha de Nacimiento: " + poli.getFechaNac());

        if (poli.isSexo()) {
            System.out.println("Sexo: Hombre");
        } else {
            System.out.println("Sexo: Mujer");
        }

        System.out.println("Puesto: " + poli.getPuesto());

        poli.proteger();

        System.out.println("-------------------------------------------------");
        
        //Creamos un objeto tipo jardinero
        Jardinero j = new Jardinero("Maria", "10/03/2004", false, 5);
        System.out.println("DATOS DEL JARDINERO");
        System.out.println("Nombre: " + j.getNombre());
        System.out.println("Fecha de Nacimiento: " + j.getFechaNac());
        
        if(j.isSexo()){
            System.out.println("Sexo: Hombre");
        } else {
            System.out.println("Sexo: Mujer");
        }
        
        System.out.println("Resistencia: " + j.getResistencia());
        
        j.podar();
    }

}
