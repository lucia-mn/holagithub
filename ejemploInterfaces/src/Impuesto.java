public interface Impuesto {

    //constantes
    double TASA_DE_IMPUESTO = 0.06;

    //métodos abstractos
    double calcularImpuestoAnual();

    void imprimirImpuesto();

    //default methods
    default void imprimirTasa() {
        System.out.println("La tasa de impuesto es " + TASA_DE_IMPUESTO);
    }

    default void aumentarTasa() {
        duplicarTasa();
    }

    //métodos privados de instancia
    private double duplicarTasa() {
        return TASA_DE_IMPUESTO * 2;
    }

    //métodos estáticos
    static double tax(int precio) {
        mostrarPrecio(precio);
        return TASA_DE_IMPUESTO * precio;
    }

    //métodos privados estáticos
    private static void mostrarPrecio(int precio) {
        System.out.println("El precio es " + precio);
    }

}
