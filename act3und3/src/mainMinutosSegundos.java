public class mainMinutosSegundos {
    public static void main(String[] args) {

        MinutosSegundos minutosSegundos = new MinutosSegundos();
        MinutosSegundos minutosSegundos1 = new MinutosSegundos();

        System.out.println(minutosSegundos.obtenerMensajeDuracion(61, 0));
        System.out.println(minutosSegundos.obtenerMensajeDuracion(120, 30));
        System.out.println(minutosSegundos.obtenerMensajeDuracion(-5, 10));
        System.out.println(minutosSegundos.obtenerMensajeDuracion(45, 65));

        System.out.println(minutosSegundos.obtenerMensajeDuracion(2765));
        System.out.println(minutosSegundos1.obtenerMensajeDuracion(2766));

        System.out.println(minutosSegundos.obtenerMensajeDuracion(3661));
        System.out.println(minutosSegundos.obtenerMensajeDuracion(-10));
    }

    /*
    ¡¡¡para los métodos de una misma clase no puedo utilizar el static!!!

    dentro de una clase tenemos varios métodos, uno con:
    int min, int seg
    y otro con int seg
    esos métodos no pueden ser static

    lo que ha pasado ha sido que en el main, en el sout
    en vez de llamar a minutosSegundos (objeto que me creo), he llamado
    a MinutosSegundos (la clase), por lo que en los métodos
    de la clase a la hora de poner public statis (cosa que es un error),
    el porgrama funcionaba

    SOLUCIÓN: no poner static en los métodos y en los objetos que me creo
    (minutosSegundos, minutosSegundos1) llamarlos en el sout en vez de
    a la clase principal (MinutosSegundos).
    */
}