public class Persona {

        //atributos
        private String nombre;
        private String apellido;
        private int edad;


        //constructor
        // parametrizar el constructor??!!!
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
            this.edad = edad;
            // si quiero poner que la edad es de 1 a 100 años eso se controla en el main, en la interfez del usuario
            //los set se controlan en el Main
        }

    public boolean esAdolescente() {
            if (edad > 12 && edad < 20) {
                //no pongas getEdad ya que estás llamando al atributo que es solo edad (los atibutos de arriba el todo)
                //no es return esAdolescente porque es una funcion y no una variable
                return true;
            } else {
            return false;
            }
        }

        public String getFullName() {
            return (this.nombre + " " + this.apellido);

            /*if (nombre.isEmpty() && apellido.isEmpty()) {
                return " ";

            } else if (apellido.isEmpty()) {
                return nombre;

            } else if (nombre.isEmpty()) {
                return apellido;

            } else {
                return nombre + apellido;
            }*/
        }
}

