import javax.swing.plaf.synth.SynthOptionPaneUI;

public class mainBanda {

    public static void main(String[] args) {

        Integrante integrante1 = new Integrante("Andrea", 21, "vocalista");
        Integrante integrante2 = new Integrante("Miguel", 20, "guitarrista");
        Integrante integrante3 = new Integrante("Gabriel", 22, "batería");

        Cancion cancion = new Cancion("Item", 1.43, "5star", 9);
        Album album = new Album("5star", 2024, "pop-rock", 38.56);

        Banda banda = new Banda("dark", 2022, integrante1, integrante2, integrante3, cancion, album);

        System.out.println("El nombre del ábum es " + album.titulo() );
        banda.lanzarAlbum();




    }
}
