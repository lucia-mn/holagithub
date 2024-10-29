public class mainPunto {

    public static void main(String[] args) {

        Punto primero = new Punto(6, 5);
        Punto segundo = new Punto(3, 1);
        System.out.println("distancia(0,0)= " + primero.distancia());
        System.out.println("distancia(segundo)= " + primero.distancia(segundo));
        System.out.println("distancia(2,2)= " + primero.distancia(2, 2));
        Punto punto = new Punto();
        System.out.println("distancia()= " + punto.distancia());
    }

    /*
    OUTPUT

    distancia(0,0)= 7.810249675906654
    distancia (segundo)= 5.0
    distancia (2,2)= 5.0
    distancia ()= 0.0
     */

    /*
    EJ4
    se inicializa en el constructor, no hay sets;
    en el caso de haber sets se tendría que inicializar allí.
    Si lo inicializas en uno hay que hacerlo en los dos!!!
    */
}
