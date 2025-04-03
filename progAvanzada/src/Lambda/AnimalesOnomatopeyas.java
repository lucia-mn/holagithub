package Lambda;

interface Onomatopeya{
    public String onomatopeya(String nombre);
}



public class AnimalesOnomatopeyas {

    public static void main(String[] args) {

        Onomatopeya perro = (nombre) -> "El " + nombre + " hace guau";
        Onomatopeya vaca=(nombre)-> "La " + nombre + " hace muuu";
        Onomatopeya oveja=nombre-> "La " + nombre + " hace beee";


        System.out.println(perro.onomatopeya("perro"));
        System.out.println(vaca.onomatopeya("vaca"));
        System.out.println(oveja.onomatopeya("oveja"));
    }

}
