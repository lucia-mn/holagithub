package intermodularColeccionDatos;

//lucia mendiola naharro

public class Resena {

    //atributos
    private String idResena;
    private int idProducto;
    private int calificacion;
    private String contenido;
    private String fPublicacion;
    private int idUsuario;

    //constructor
    public Resena(String idResena, int idProducto, int calificacion, String contenido, String fPublicacion, int idUsuario) {
        this.idResena = idResena;
        this.idProducto = idProducto;
        this.calificacion = calificacion;
        this.contenido = contenido;
        this.fPublicacion = fPublicacion;
        this.idUsuario = idUsuario;
    }

    //getters
    public String getIdResena() {
        return idResena;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFPublicacion() {
        return fPublicacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }


    //setters
    public void setIdResena(String idResena) {
        this.idResena = idResena;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFPublicacion(String fPublicacion) {
        this.fPublicacion = fPublicacion;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


    //toString
    /*@Override
    public String toString() {
        return "<RESENAS>\n" +
                "      <resenaJuego>\n" +
                "           <idResena>" + getIdResena() + "</idResena>\n" +
                "           <idProducto>" + getIdProducto() + "</idProducto>\n" +
                "           <calificacion>" + getCalificacion() + "</calificacion>\n" +
                "           <contenido>" + getContenido() + "</contenido>\n" +
                "           <fPublicacion>" + getFPublicacion() + "</fPublicacion>\n" +
                "           <idUsuario>" + getIdUsuario() + "</idUsuario>\n" +
                "      </resenaJuego>\n" +
                "</RESENAS>";
    }*/

    @Override
    public String toString() {
        return "Reseña {" +
                "\nID Reseña: " + idResena +
                "\nID Producto: " + idProducto +
                "\nCalificación: " + calificacion +
                "\nContenido: \"" + contenido + "\"" +
                "\nFecha Publicación: " + fPublicacion +
                "\nID Usuario: " + idUsuario +
                "\n}\n";
    }

}
