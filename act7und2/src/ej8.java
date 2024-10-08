public class ej8 {

    public static void main(String[] args) {

                int contadorPrimos = 0;  // Contador para saber cuántos números primos hemos encontrado
                int numero = 2;          // Empezamos a buscar primos a partir del número 2 (el primer número primo)

                // Bucle exterior para encontrar los primeros 50 números primos
                    boolean esPrimo = true; // Asumimos que el número es primo

                    // Bucle interior para comprobar si el número es primo
                    for (int i = 2; i <= Math.sqrt(numero); i++) { // Verificamos divisores hasta la raíz cuadrada del número
                        if (numero % i == 0) {  // Si el número es divisible por otro número que no sea 1 o él mismo
                            esPrimo = false;    // No es primo
                            break;             // Salimos del bucle interior porque ya sabemos que no es primo
                        }
                    }

                    // Si es primo, lo imprimimos y aumentamos el contador de primos
                    if (esPrimo) {
                        System.out.println(numero);
                        contadorPrimos++;
                    }

                    numero++; // Pasamos al siguiente número
                }
            }
        }
