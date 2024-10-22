public class Calculadora {

    //atributos
    private double primerNumero;
    private double segundoNumero;

    //constructor sin nada
    public Calculadora() {
    }

    //getters and setters
    public double getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }


    public double getResultadoSuma() {

        return primerNumero + segundoNumero;
    }

    public double getResultadoResta() {

        return primerNumero - segundoNumero;
    }

    public double getMultiplicationResult() {

        return primerNumero * segundoNumero;
    }

    public double getDivisionResult() {

        if (segundoNumero == 0) {
            return 0;

        } else return primerNumero / segundoNumero;

    }
}
