public class Alumno {

    public static void main(String[] args) {
        //creamos una array de Alumnos
        Alumno[] dam1k = new Alumno[5];
        //creamos dos alumnos en las dos primeras posiciones
        dam1k[0] = new Alumno("Pepe", 7);
        dam1k[1] = new Alumno("Maria", 9);
        //mostramos alumnos
        dam1k[0].mostrarAlumno();
        dam1k[1].mostrarAlumno();
        //produce el error NullPointerException
        //dam1k[2].mostrarAlumno();
        System.out.println(dam1k[0].toString());
        System.out.println(dam1k[0].getNota());
        System.out.println(dam1k[0].getNombre());
    }


    private String nombre;
    private int nota;

    //constructor, meter datos, igual que los setters
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //getters, sacar datos
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    //para imprimir, hace un return, el sout se hace en el main
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    //para imprimir también
    public void mostrarAlumno() {
        System.out.println( "Alumno: " + nombre + " nota:" + nota);
    }

}
