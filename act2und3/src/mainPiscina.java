public class mainPiscina {

    public static void main(String[] args) {

        MetrosCub metrosCub = new MetrosCub(3,6,2,1);
        Cloro cloro = new Cloro(35.01, 200, Cloro.TipoCloro.PASTILLA);
        Piscina piscina = new Piscina("blanca", Piscina.TipoPiscina.RECTANGULAR, "acero galvanizado", 2018);
        Calcular calcular = new Calcular(metrosCub, cloro);

        metrosCub.setAncho(12.7);
        metrosCub.setLargo(6.5);
        metrosCub.setProfmax(2);
        metrosCub.setProfmin(0.5);

        System.out.println("La piscina es " + piscina.getColor() + ", está hecha de " + piscina.getMaterial()
        + ", es " + piscina.getTipoPiscina() + " y se construyó en el " + piscina.getFechaconstruccion());

        System.out.println("El cloro cuesta " + cloro.getPrecio() + "€ y viene en " + cloro.getTipoCloro());

        System.out.println("El total de cloro para " + metrosCub.getMetrosCubicos() + " m3 es de " + calcular.getCantidadCloro()
        + " gramos de cloro");

    }
}
