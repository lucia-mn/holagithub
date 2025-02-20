package heroesReino1J;

import java.util.ArrayList;

public class Asesino extends Heroe {

    protected int sigilo;

    //constructor
    public Asesino(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, ArrayList<Heroe> tipoHeroes, int sigilo) {
        super(nombre, nivel, puntosVida, armas, tipoHeroes);
        this.sigilo = sigilo;
    }

    //getter
    public int getSigilo() {
        return sigilo;
    }
}
