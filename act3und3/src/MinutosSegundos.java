public class MinutosSegundos {

    private int minutos;
    private int segundos;


    //constructor
    /*public MinutosSegundos(int minutos, int segundos) {
        this.minutos = minutos;
        this.segundos = segundos;
    }*/


    //get-set
    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }


    //métodos
    public String obtenerMensajeDuracion(int minutos, int segundos) {
        if (minutos < 0 || segundos < 0 || segundos > 59) {
            return "Valor inválido";
        }

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        return horas + "h " + minutosRestantes + "m " + segundos + "s";
    }

    public String obtenerMensajeDuracion(int segundos) {
        if (segundos < 0) {
            return "Valor inválido";
        }

        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        return obtenerMensajeDuracion(minutos, segundosRestantes);
    }

}