public class Calcular {

    //campos
    //private Piscina piscina;
    private MetrosCub metrosCub;
    private Cloro cloro;


    //constructor
    public Calcular(MetrosCub metrosCub, Cloro cloro) {
        this.metrosCub = metrosCub;
        this.cloro = cloro;
    }

    //métodos
    public double getCantidadCloro () {
        return ((cloro.getGramos()/25)* metrosCub.getMetrosCubicos());
    }

}
