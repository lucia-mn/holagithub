public class Main {
    public static void main(String[] args) {
        //crear objeto e importas las características con el new Coche
        Coche micoche = new Coche(4,14800,15000,"gasolina","ibiza","rojo","seat");
        //Coche micoche2 = new Coche();
        //micoche.setPuertas(9);
        //micoche2.setPuertas(3);
        System.out.println("Las puertas son: " + micoche.getPuertas());
        System.out.println("El modelo de mi coche uno es: " + micoche.getModelo());
        System.out.println("El color de mi coche uno es: " + micoche.getColor());
        //System.out.println("Las puertas de mi otro coche son: " + micoche2.getPuertas());
    }
}