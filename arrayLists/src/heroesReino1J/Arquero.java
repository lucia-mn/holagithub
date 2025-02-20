package heroesReino1J;

import java.util.ArrayList;

public class Arquero extends Heroe {

    protected int precision;

    //constructor
    public Arquero(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, ArrayList<Heroe> tipoHeroes, int precision) {
        super(nombre, nivel, puntosVida, armas, tipoHeroes);
        this.precision = precision;
    }

    //getter
    public int getPrecision() {
        return precision;
    }
}
