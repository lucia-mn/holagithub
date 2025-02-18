package heroesReino1J;

import java.util.ArrayList;

public class Heroe {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected ArrayList<Arma> armas;
    protected ArrayList<TipoHeroe> tipoHeroes;

    //constructor
    public Heroe(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, ArrayList<TipoHeroe> tipoHeroes) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.armas = armas;
        this.tipoHeroes = tipoHeroes;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public ArrayList<TipoHeroe> getTipoHeroes() {
        return tipoHeroes;
    }


    //metodos



















}
