package heroesReino1J;

import java.util.ArrayList;

public class Heroe {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected ArrayList<Arma> armas;

    //constructor
    public Heroe(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.armas = armas != null ? armas : new ArrayList<>(); // Evita null
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


    //metodos
    public void addArma(Arma arma) {
        if (arma != null) {
            armas.add(arma);
            System.out.println(arma.getNombre() + " el arma " + nombre + " ha sido añadida al arsenal");
        }
    }

    public void eliminarArma(Arma arma) {
        if (armas.remove(arma)) {
            System.out.println(arma.getNombre() + " el arma " + nombre + " ha sido eliminada del arsenal");
        } else {
            System.out.println(nombre + " el guerrero ha perdido esta arma en una feroz batalla");
        }
    }


    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre)
                .append(", Nivel: ").append(nivel)
                .append(", Puntos de Vida: ").append(puntosVida)
                .append(", Armas: ");

        if (armas.isEmpty()) {
            sb.append("Ninguna");
        } else {
            for (Arma arma : armas) {
                sb.append(arma.getNombre()).append(" (Daño: ").append(arma.getDanyo()).append("), ");
            }
        }
        return sb.toString();
    }
}



/*public class Heroe {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected ArrayList<Arma> armas;
    protected ArrayList<Heroe> tipoHeroes;

    // Constructor
    public Heroe(String nombre, int nivel, int puntosVida, ArrayList<Arma> armas) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.armas = (armas != null) ? armas : new ArrayList<>(); // Evita null
    }

    // Getters
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


    //metodos
    public boolean addNewHero(TipoHeroe tipoHeroes) {
        if (tipoHeroes.getNombre() != null) {
            tipoHeroes.add(tipoHeroes);
            return true;
        }
        return false;
    }

    public boolean addHero(String nombreHeroe, int nivel, int puntosVida, ArrayList<Arma> armas) {
        if (nombreHeroe == null || nombreHeroe.isEmpty()) {
            return false;
        }

        Heroe nuevoHeroe = new Heroe(nombreHeroe, nivel, puntosVida, armas);
        return true;
    }

    public int findHero(String nombre) {
        for (int i = 0; i < tipoHeroes.size(); i++) {
            if (tipoHeroes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

}*/

