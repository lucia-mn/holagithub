public class Main {
    public static void main(String[] args) {
        /*//crear objeto e importas las características con el new Coche
        Coche micoche = new Coche(5,4,"seat ibiza", "rojo");
        Coche micoche2 = new Coche();
        //micoche.setPuertas(9);
        micoche2.setPuertas(3);
        System.out.println("Las puertas son: " + micoche.getPuertas());
        System.out.println("El nombre de mi coche uno es: " + micoche.getModelo());
        System.out.println("Las puertas de mi otro coche son: " + micoche2.getPuertas());
    }*/

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