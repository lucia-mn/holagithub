package ejemploEduardo;

public class MainInfoClase {

    public static void main(String[] args) {
        Colchon co=new Colchon("Pikolin",12.5,100);
        Almohada al2=new Almohada("Comodo",3,50.0);
        infoclase(co);
        infoclase(al2);
    }
    public static void infoclase(Object o)
    {
        Class<?> c;
        c=o.getClass();
        System.out.println("Nombre de la clase: "+c.getName());
        System.out.println("Nombre del paquete: "+c.getPackage().getName());
        System.out.println("Hereda de la clase: "+c.getSuperclass().getName());
        System.out.println("Posee los campos:");
        for (int i=0;i<c.getDeclaredFields().length;i++)
        {
            System.out.println("\t"+ ""+c.getDeclaredFields()[i].getName()+ " "+c.getDeclaredFields()[i].getType().getName());
        }

    }
}
