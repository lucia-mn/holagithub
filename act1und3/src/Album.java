public class Album {

    //atributos
    private String titulo;
    private String artista;
    private int fechalanz;
    private String genero;
    private double precio;
    private int ventas;
    private int integrantes;


    //constructor
    public Album(String titulo, String artista, int fechalanz, String genero, double precio, int ventas, int integrantes) {
        this.titulo = titulo;
        this.artista = artista;
        this.fechalanz = fechalanz;
        this.genero = genero;
        this.precio = precio;
        this.ventas = ventas;
        this.integrantes = integrantes;
    }


    //getters-setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getFechalanz() {
        return fechalanz;
    }

    public void setFechalanz(int fechalanz) {
        this.fechalanz = fechalanz;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }


    //métodos
    public boolean esSuperVentas() {
        if (ventas >= 1000000) {
            return true;
        } else {
            return false;
        }
    }

    public String getTipoArtista() {
        if (integrantes == 1) {
            return "un solista";
        } else if (integrantes == 2) {
            return "un dúo";
        } else if (integrantes >= 3) {
            return "una banda";
        } else {
            return "Respuesta inválida";
        }
    }
}
