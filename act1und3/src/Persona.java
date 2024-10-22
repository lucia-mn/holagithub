public class Persona {

    //atributos
    private String nombre;
    private String apellido;
    private int edad;


    //constructor
    public Persona() {

    }


    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 100) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public boolean esAdolescente() {
        return edad > 12 && edad < 20;
    }

    public String getFullName() {
        if (nombre.isEmpty() && apellido.isEmpty()) {
            return ""; // Si ambos campos están vacíos
        } else if (apellido.isEmpty()) {
            return nombre; // Si solo el apellido está vacío
        } else if (nombre.isEmpty()) {
            return apellido; // Si solo el nombre está vacío
        } else {
            return nombre + " " + apellido; // Nombre completo si ambos están presentes
        }
    }

}
