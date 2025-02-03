public class Usuario {
    // int idUsuario; // Auto generado en la base de datos??
    String nombre; // Varchar 32
    String mail; // Varchar 64
    String fRegistro; // tipo DATE se debe validar

    public Usuario(String nombre, String mail, String fRegistro) {
        this.nombre = nombre;
        this.mail = mail;
        this.fRegistro = fRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(String fRegistro) {
        this.fRegistro = fRegistro;
    }
}
