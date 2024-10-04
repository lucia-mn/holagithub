public class ej2 {
    public static void main(String[] args) {
        //a bien, da cero, default quitar el break
        //b bien, da uno, default quitar el break
        //c no se acepta en un switch, hay que convertir la expresion a entera (casting)
        //d falta el case 2
        //e faltan los breaks, al ser k=3 saldrían 3 4 y default
        //f bien,saldría el 3 y 4
        //g no da error, pero el case 1 está vacío
        //h error sintáctico, no permite la ejecución
        //i falta el default

        int k = 0;
        switch (k + 1) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
        }
    }
}
