public class ej3 {

    public static void main(String[] args) {

        try {
            double d = Math.random();
            if (d > 0.95)
                throw new ArithmeticException(d + " está fuera de rango") ;
            System.out.println("El número es " + d);

            double j = Math.random();
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            System.out.println("El número es " + j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
    // qu eestá fuera de rango y el otro no te lo saca
    // para poder sacarlo habría que ponerle un catch
}
