package SET.ej5und6Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();

    public static void main(String[] args) {

        CuerpoCeleste Mercurio = new CuerpoCeleste("Mercurio", 88.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Mercurio", Mercurio);
        planetas.add(Mercurio);

        CuerpoCeleste Venus = new CuerpoCeleste("Venus", 225.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Venus", Venus);
        planetas.add(Venus);

        CuerpoCeleste Tierra = new CuerpoCeleste("La Tierra", 365.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Tierra", Tierra);
        planetas.add(Tierra);

        CuerpoCeleste Marte = new CuerpoCeleste("Marte", 687.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Marte", Marte);
        planetas.add(Marte);

        CuerpoCeleste Jupiter = new CuerpoCeleste("Jupiter", 4332.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Júpiter", Jupiter);
        planetas.add(Jupiter);

        CuerpoCeleste Saturno = new CuerpoCeleste("Saturno", 10759.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Saturno", Saturno);
        planetas.add(Saturno);

        CuerpoCeleste Urano = new CuerpoCeleste("Urano", 30660.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Urano", Urano);
        planetas.add(Urano);

        CuerpoCeleste Neptuno = new CuerpoCeleste("Neptuno", 165.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Neptuno", Neptuno);
        planetas.add(Neptuno);

        CuerpoCeleste Pluton = new CuerpoCeleste("Pluton", 248.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("Plutón", Pluton);
        planetas.add(Pluton);


        //lunas
        CuerpoCeleste Luna = new CuerpoCeleste("Luna", 27.0, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Luna", Luna);
        Tierra.addSatelite(Luna);

        CuerpoCeleste Deimos = new CuerpoCeleste("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Deimos", Deimos);
        Marte.addSatelite(Deimos);

        CuerpoCeleste Phobos = new CuerpoCeleste("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Phobos", Phobos);
        Marte.addSatelite(Phobos);

        CuerpoCeleste Io = new CuerpoCeleste("Io", 1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Io", Io);
        Jupiter.addSatelite(Io);

        CuerpoCeleste Europa = new CuerpoCeleste("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Europa", Europa);
        Jupiter.addSatelite(Europa);

        CuerpoCeleste Ganymede = new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Ganymede", Ganymede);
        Jupiter.addSatelite(Ganymede);

        CuerpoCeleste Callisto = new CuerpoCeleste("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Callisto", Callisto);
        Jupiter.addSatelite(Callisto);


        //imprimir datos
        for(Integer planeta: setC) {
            System.out.println(num);
        }

    }

}
