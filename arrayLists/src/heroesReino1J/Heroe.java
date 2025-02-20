package heroesReino1J;

import java.util.ArrayList;

public class Heroe {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected ArrayList<Arma> armas;
    protected ArrayList<Heroe> tipoHeroes;

    //constructor
    public Heroe(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas, ArrayList<Heroe> tipoHeroes) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        //this.armas = (armas != null) ? armas : new ArrayList<>(); // Evita null
        //this.tipoHeroes = (tipoHeroes != null) ? tipoHeroes : new ArrayList<Heroe>(); // Evita null
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

    public ArrayList<Heroe> getTipoHeroes() {
        return tipoHeroes;
    }


    //metodos
    public boolean addNewHero(TipoHeroe tipoHeroes) {
        if (tipoHeroes.getNombre() != null) {
            tipoHeroes.add(tipoHeroes);
            return true;
        }
        return false;
    }

    public int findHero(String nombre) {
        for (int i = 0; i < tipoHeroes.size(); i++) {
            if (tipoHeroes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addHero(String nombreHeroe, int nivel, int puntosVida, ArrayList<Arma> armas, ArrayList<Heroe> tipoHeroes) {
        if (nombreHeroe == null || nombreHeroe.isEmpty()) {
            return false;
        }

        if (findHero(nombre) != -1) {
            return false;
        }

        Heroe nuevoHeroe = new Heroe(nombreHeroe, nivel, puntosVida, armas, tipoHeroes);
        this.tipoHeroes.add(nuevoHeroe);
        return true;
    }




















}
