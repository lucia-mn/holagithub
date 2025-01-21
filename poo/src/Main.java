/*public class Main {


    public static void main(String[] args) {
        //crear objeto e importas las características con el new Coche
        Coche micoche = new Coche();
        Coche micoche2 = new Coche();
        //micoche.setPuertas(9);
        micoche2.setPuertas(3);
        System.out.println("Las puertas son: " + micoche.getPuertas());
        System.out.println("El nombre de mi coche uno es: " + micoche.getModelo());
        System.out.println("Las puertas de mi otro coche son: " + micoche2.getPuertas());
    }
}*/

public class Main {
    public static void main(String[] args) {

        /*Alumno pepito = new Alumno();


        Dog dog = new Dog("Maxi", 2, 5, 2, 4, 1);
        //llamamos al método eat que existe en la clase padre
        dog.eat();*/


        /*Vehiculo vehiculo = new Vehiculo("carlos", 70);
        vehiculo.mover();
        //vehiculo.parar();

        CocheCombustion coche = new CocheCombustion("laura", 70, 0122, "mercedes", 4, 20000, 5);
        coche.cambiarMarcha();*/


        Circulo circulo = new Circulo(12.80);
        System.out.println("El área del círculo es: " + circulo.getArea() + " cm2");

        Cilindro cilindro = new Cilindro(19.03, 14.00);
        System.out.println("El volumen del cilindro es: " + cilindro.getVolume() + " cm3");




        Procesador procesador = new Procesador("Intel", 2, 3);
        Monitor monitor = new Monitor("Philips", "1024x900", 24);
        Teclado teclado = new Teclado("Negror",90);

        Ordenador ordenador = new Ordenador(procesador, teclado, monitor);
        ordenador.getMonitor().dibujarPixel(34, 56);
        ordenador.getProcesador().cargarPrograma("Demo");
        ordenador.getTeclado().pushKey('X');

        ordenador.encender();
        System.out.println(ordenador);

    }
}

