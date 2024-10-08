//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final int MAX_WIDTH = 5;

        for (int i = 1; i <= MAX_WIDTH ; i++) {
            for (int j = MAX_WIDTH; j >= i; j--) {
                System.out.print('#');
            }
            System.out.println();
        }

        // el continue va siempre dentro de un bucle; si no hay un bucle no hay continue y viceversa

        /*int a = 0;
        int b = 9;
        if (a != b) {
            continue;
        }*/


        // no está bien escrita, el if tiene que ir dentro de los corchetes


    }
}