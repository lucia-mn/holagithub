public class mainEncapsulacion {

    public static void main(String[] args) {

        Impresora impresora = new Impresora(true, 53, 80);

        System.out.println("Le vas a añadir " + impresora.nivelTonerActual(20) + " de tóner");
        System.out.println("Le vas a añadir " + impresora.nivelTonerActual(30) + " de tóner");
        System.out.println("Vas a imprimir " + impresora.imprimirPaginas() + " páginas");

        System.out.println("Has impreso un total de " + impresora.getPaginasImpresas() + " páginas");


    }
}
