package linkedList.ej1act2und6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    //atributos
    protected String nombre;
    protected String artista;
    protected ArrayList<Cancion> canciones;

    //constructor
    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    Cancion cancion = new Cancion("Haven", 1.43);

    //metodos
    private Cancion findSong(String tituloCancion) {
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getTitulo().equalsIgnoreCase(tituloCancion)) {
                return cancion;
            }
        }
        return null;
    }

    public boolean addSong(String tituloCancion, double duracionCancion) {
        if (tituloCancion == null || duracionCancion <= 0) {
            return false;
        }
        if (findSong(tituloCancion) != null) {
            return false;
        }

        Cancion nuevaCancion = new Cancion(tituloCancion, duracionCancion);
        canciones.add(nuevaCancion);
        return true;
    }

    public boolean addToPlaylist(int numeroPista, LinkedList<Cancion> playlist) {
        int index = numeroPista -1;

        if (index < 0 || index >= canciones.size()) {
            System.out.println("El número de pista " + numeroPista + " no es válido");
            return false;
        }

        Cancion cancionAnadir = canciones.get(index);
        playlist.add(cancionAnadir);
        return true;
    }


}

