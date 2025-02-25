package examenVuelos;

public class Vuelo {

    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected String dia;
    protected String clase;

    //constructor
    public Vuelo(String numeroVuelo, String origen, String destino, String dia, String clase) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.clase = clase;
    }

    //getters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDia() {
        return dia;
    }

    public String getClase() {
        return clase;
    }


    //metodos???

    //toString
    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", dia='" + dia + '\'' +
                ", clase='" + clase + '\'' +
                '}';
    }
}
