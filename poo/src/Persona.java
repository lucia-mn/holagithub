/*public class Coche {

    private int puertas;
    private int ruedas;
    private String modelo;
    private String color;

    //constructores
    public Coche(int puertas, int ruedas, String modelo, String color) {
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.color = color;
    }

    public Coche() {
    }


    //generate gettings and settings
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        if(puertas>=3 && puertas<=5){
            this.puertas=puertas;
        } else {
            System.err.println("Error: número de puertas incorrecto");
        }
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getModelo() {
        return modelo.toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}*/
// set: puertas(5)
//get: para que me diga el número de puertas

public class Persona {
    private String nif;
    private String nombre;
    /*public Persona() {
        System.out.println("Ejecutando el constructor de Persona...");
    }*/
    /* Resto de métodos */
}

class Alumno extends Persona{
    private String curso;
    public Alumno() {
        System.out.println("Ejecutando el constructor de Alumno...");
    }
    /* Resto de métodos */
}
