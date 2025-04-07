package act5und7.supplier.ej12al14;

import java.util.Date;
import java.util.function.Function;

public class main {

    public static void main(String[] args) {

        //ej.12
        Programador programador1 = new Programador("andrea", 1200.80, new Date());
        System.out.println(programador1);

        //ej.13
        Programador programador2 = new Programador("lucia");
        System.out.println(programador2);


        //ej.14
        System.out.println("*----- ej.14 -----*");
        Programador programador3 = fabricaProgramadores(nombre -> new Programador(nombre, 4000.0, new Date()));
        System.out.println(programador3);

        Programador programador4 = fabricaProgramadores(nombre -> new Programador(nombre));
        System.out.println(programador4);
    }

    //metodo ej.14
    public static Programador fabricaProgramadores (Function<String, Programador> programador) {
        return programador.apply("reme");
    }
}
