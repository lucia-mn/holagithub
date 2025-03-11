package SET.ej5und6Set;

import java.util.Set;

public class Planeta extends CuerpoCeleste {

    public Planeta(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste satelite) {
        return super.addSatelite(satelite);
    }
}
