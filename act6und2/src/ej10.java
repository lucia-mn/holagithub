public class ej10 {

    public static void main(String[] args) {

        int suma = 0;
        int j= 0; //esto se pone para para el segundo sout, ya que hay que declarar la variable j
        for (j = 0; j < 8; j++)
            suma = suma + j;

        System.out.println("la suma es: " + suma);
        System.out.println("el valor de j es : " + j);

    }
    /* sí que es correcto ya que suams 0+1+2+3+4+5+6+7 = 28
       a) cuando se añade la siguiente instrucción el programa lo interpreta como solo la j
       // que máximo llega a 8 así que: j = 8
    */
}
