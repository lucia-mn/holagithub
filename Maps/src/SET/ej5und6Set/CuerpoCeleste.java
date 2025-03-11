package SET.ej5und6Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CuerpoCeleste {

    public enum TipoCuerpoCeleste {ESTRELLA,PLANETA,PLANETA_ENANO,LUNA,COMETA,ASTEROIDE};
    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        satelites = new HashSet<>();
    }

    //metodos
    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return HashSet.newHashSet(9);
    }

    public void setSatelites(Set<CuerpoCeleste> satelites) {
        this.satelites = satelites;
    }

    public boolean addSatelite(CuerpoCeleste satelite) {
        return this.satelites.add(satelite);
    }

    public boolean equals() {
        if (this.tipoCuerpo == tipoCuerpo) {
            return true;

        } else return false;
    }

    public int hashCode() {
        int numArb = (int) (Math.random() * 1000);
        return nombre.hashCode() + tipoCuerpo.hashCode() + numArb;
    }
    /*@Override
    return Objects.hash(nombre, tipo) + numeroArbitrario;*/

    //toString
    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombre + '\'' +
                ", periodoOrbital=" + periodoOrbital +
                ", satelites=" + satelites +
                ", tipoCuerpo=" + tipoCuerpo +
                '}';
    }

}
