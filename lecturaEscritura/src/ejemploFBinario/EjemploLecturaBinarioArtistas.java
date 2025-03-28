package ejemploFBinario;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EjemploLecturaBinarioArtistas {
    public static void main(String[] args) {

       File archivo=new File("artistas.dat");

        try {
             FileInputStream fis = new FileInputStream(archivo);
             ObjectInputStream ois= new ObjectInputStream(fis);
             while(fis.available()>0) {
                  Artista artista=(Artista) ois.readObject(); //hacer el cast
                  System.out.println(artista.toString()); //imprimirlo
             }
             fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}