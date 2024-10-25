public class Muro {

     private double ancho;
     private double alto;


     // constructor por defecto sin parámetros
     public Muro() {
         this.ancho = 0;
         this.alto = 0;
     }


     //constructor con parámetros
     public Muro(double ancho, double alto) {
         this.ancho = ancho;
         this.alto = alto;
     }



    //getters-setters(métodos)
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho < 0) {
            this.ancho = 0;
        } else {
            this.ancho = ancho;
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto < 0) {
            this.alto = 0;
        } else {
            this.alto = alto;
        }
    }

    public double getArea() {
        return ancho * alto;
    }

}
