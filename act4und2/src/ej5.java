public class ej5 {

    public static void main(String[] args) {

        int contador = 1;
        do {
            System.out.println(contador);
            if (contador % 4 == 0) {
                System.out.println("múltiplo de 4 encontrado. Salir");
                contador = 10;
            }
            contador++;

        } while(contador <= 10);
    }
}

/*
a) el código va sumando númros hasta que lo dividas entre 4 y dé 0
encuentra el primer múltiplo de 4
b) las condición se ejecuta 4 veces
c) 5
d) 4, y una falsa
e) actualizar la variable contador
f) que el máximo que cuente sea hasta 10
g)
*/
