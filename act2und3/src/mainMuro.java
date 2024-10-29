public class mainMuro {
    public static void main(String[] args) {

        Muro muro = new Muro(5,4);
        System.out.println("area= " + muro.getArea());
        muro.setAlto(-1.5);
        System.out.println("ancho= " + muro.getAncho());
        System.out.println("alto= " + muro.getAlto());
        System.out.println("area= " + muro.getArea());

    }

    /*OUTPUT:
    area= 20.0
    ancho= 5.0
    alto= 0.0
    area= 0.0*/
}