public class Calculadora {

    private int primerNumero;
    private int segundoNumero;

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }


    public int getResultadoSuma() {

        return primerNumero + segundoNumero;
    }

    public int getResultadoResta() {

        return primerNumero - segundoNumero;
    }

    public int getMultiplicationResult() {

        return primerNumero * segundoNumero;
    }

    public int getDivisionResult() {

        if (segundoNumero == 0) {
            return 0;

        } else return primerNumero / segundoNumero;

    }
}
