public class MainTelefono {

    public static void main(String[] args) {
        Impuesto impuesto = new TelefonoMovil(123456789);
        impuesto.imprimirImpuesto();

        impuesto.imprimirTasa(); //Imprime la tasa que es 0.06 * 12

        //métodos que se hacen desde el main
        double impuesto_precio = Impuesto.tax(1000); //Cambiar el precio llamando al método de la interfaz
        System.out.println("El impuesto es: " + impuesto_precio); //Imprimir el impuesto que será 60

    }
}