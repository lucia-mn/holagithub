package resena;

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



    //setters
    /*public void setIdResena(String idResena) {
        if (idResena != null && idResena.length() <= 64) {
            this.idResena = idResena;
        } else {
            throw new IllegalArgumentException("idReseña debe ser una cadena de texto única con un máximo de 64 caracteres.");
        }
    }

    public void setIdProducto(int idProducto) {
        if (idProducto > 0) {
            this.idProducto = idProducto;
        } else {
            throw new IllegalArgumentException("idProducto debe ser un valor positivo.");
        }
    }

    public void setCalificacion(int calificacion) {
        if (calificacion >= 1 && calificacion <= 10) {
            this.calificacion = calificacion;
        } else {
            throw new IllegalArgumentException("La calificación debe estar entre 1 y 10.");
        }
    }

    public void setContenido(String contenido) {
        if (contenido != null && contenido.length() <= 100) {
            this.contenido = contenido;
        } else {
            throw new IllegalArgumentException("El contenido debe tener un máximo de 100 caracteres.");
        }
    }

    public void setFPublicacion(String fPublicacion) {
        if (fPublicacion != null && fPublicacion.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.fPublicacion = fPublicacion;
        } else {
            throw new IllegalArgumentException("La fecha de publicación debe tener el formato YYYY-MM-DD.");
        }
    }

    public void setIdUsuario(int idUsuario) {
        if (idUsuario > 0) {
            this.idUsuario = idUsuario;
        } else {
            throw new IllegalArgumentException("idUsuario debe ser un valor positivo.");
        }
    }*/



    //toString
    @Override
    public String toString() {
        return "Reseña{" +
                "\nidResena='" + idResena + '\'' +
                ", \nidProducto=" + idProducto +
                ", \ncalificacion=" + calificacion +
                ", \ncontenido='" + contenido + '\'' +
                ", \nfPublicacion='" + fPublicacion + '\'' +
                ", \nidUsuario=" + idUsuario +
                '}';
    }
}

