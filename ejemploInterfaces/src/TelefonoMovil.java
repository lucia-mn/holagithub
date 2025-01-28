public class TelefonoMovil implements Impuesto {

    private int minumero;
    private boolean estasonando;

    //constructor
    public TelefonoMovil(int minumero) {
        this.minumero = minumero;
    }

    //implementar métodos de la interfaz
    @Override
    public double calcularImpuestoAnual() {
        return TASA_DE_IMPUESTO * 12;
    }

    @Override
    public void imprimirImpuesto() {
        System.out.println("El impuesto anual es: " +  calcularImpuestoAnual());

    }
}
