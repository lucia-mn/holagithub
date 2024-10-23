public class personaMain {

    public static void main(String[] args) {

    Persona persona = new Persona();
        persona.setNombre("");   // nombre is set to empty string
        persona.setApellido("");    // apellido is set to empty string
        persona.setEdad(10);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente= " + persona.esAdolescente());
        persona.setNombre("Patri");    // nombre is set to Patri
        persona.setEdad(18);
        System.out.println("fullName= " + persona.getFullName());
        System.out.println("adolescente = " + persona. esAdolescente ());
        persona.setApellido("Guerrero");   // se establece apellido a Guerrero
        System.out.println("fullName= " + persona.getFullName());

        /*
        OUTPUT
         fullName=
         adolescente = false
         fullName= Patri
         adolescente = true
         fullName= Patri Guerrero
         */


    }
// con el set se le dan valores, se le cambian los valores con el set

/*
Clase persona, tiene nombre, apellidos, edad, etc. = getters y setters
llamas o te refieres a los atributos de la clase con this.nombre, this.apellido, etc.

esos tres valores están en la clase y en ningún sitio más,
los atributos no se meten en la clase, son funciones añadidas???

DENTRO DE LA CLASE NO SE UTILIZAN LOS GETS (CLASE= JAVA PERSONA Y NO EL MAINPERSONA)
LOS GETS SE PONEN EN EL MAIN!!!
 */


}