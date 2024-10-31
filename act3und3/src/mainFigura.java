public class mainFigura {

    public static void main(String[] args) {

        Figura figura = new Figura();

        System.out.println(figura.area(5.0));
        System.out.println(figura.area(-1.0));

        System.out.println(figura.area(5.0, 4.0));
        System.out.println(figura.area(-1.0, 4.0));
        System.out.println(figura.area(5.0, -4.0));
    }

    /*
    INPUT OUTPUT
    area (5.0); devuelve 78.53975
    area (-1); devuelve -1.0
    area (5.0, 4.0); devuelve 20.0 (5 * 4 = 20)
    area (-1.0, 4.0); devuelve -1.0
     */
}
