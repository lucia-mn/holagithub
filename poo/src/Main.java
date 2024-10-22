public class Main {
    public static void main(String[] args) {
        //crear objeto e importas las características con el new Coche
        Coche micoche = new Coche(5,4,"seat ibiza", "rojo");
        Coche micoche2 = new Coche();
        //micoche.setPuertas(9);
        micoche2.setPuertas(3);
        System.out.println("Las puertas son: " + micoche.getPuertas());
        System.out.println("El nombre de mi coche uno es: " + micoche.getModelo());
        System.out.println("Las puertas de mi otro coche son: " + micoche2.getPuertas());
    }
}