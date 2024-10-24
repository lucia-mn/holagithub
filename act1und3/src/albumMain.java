public class albumMain {
    public static void main(String[] args) {

        Album mialbum = new Album("Origins", "Imagine Dragons", 2018, "pop-rock", 17.44, 75000000, 4);

        //mialbum.setTitulo("Origins"); con el set lo que hacemos es "machacar" la información que ya hay arriba por lo que
        // a no ser que te hayas equivocado y le quieras cambiar el valor no hace falta volver a ponerlo
        System.out.println("El título del álbum es " + mialbum.getTitulo());

        System.out.println("Es de " + mialbum.getArtista());

        System.out.println("Se lanzó en el año " + mialbum.getFechalanz());

        System.out.println("Su género es " + mialbum.getGenero());
        System.out.println("El precio de venta es de " + mialbum.getPrecio() + "€");

        mialbum.setVentas(75000000);
        System.out.println("El ábum es considerado superventas: " + mialbum.esSuperVentas());
        mialbum.setIntegrantes(4);
        System.out.println("Es " + mialbum.getTipoArtista());

    }

}

//to.string()