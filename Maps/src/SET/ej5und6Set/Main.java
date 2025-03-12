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
        //vi
        System.out.println("Planetas en el sistema solar: ");
        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta.getNombre());
        }

        //vii
        CuerpoCeleste marte = sistemaSolar.get("Marte");
        if (marte != null) {
            System.out.println("Lunas de Marte: ");
            for (CuerpoCeleste luna : marte.getSatelites()) {
                System.out.println(luna.getNombre());
            }
        }

        //viii
        Set<CuerpoCeleste> lunas = new HashSet<>();
        for (CuerpoCeleste planeta : planetas) {
            lunas.addAll(planeta.getSatelites());
        }

        //ix
        System.out.println("Todas las lunas: ");
        for (CuerpoCeleste luna : lunas) {
            System.out.println(luna.getNombre());
        }
        System.out.println("Total de lunas: " + lunas.size());

        //x
        CuerpoCeleste pluton884 = new CuerpoCeleste("Plutón", 884.0, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        planetas.add(pluton884);

        //xi
        System.out.println("Planetas después de agregar Plutón-884: ");
        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta);
        }

        if (planetas.contains(pluton884)) {
            System.out.println("Plutón-884 fue agregado al conjunto");
        } else {
            System.out.println("Plutón-884 NO fue agregado al conjunto porque ya existía");
        }
    }

}
