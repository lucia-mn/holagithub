
import java.util.Scanner;

        public class FuncionesMatematicas {

            // Funciones matemáticas (las mismas que antes)
            public static boolean esCapicua(int numero) {
                return numero == voltea(numero);
            }

            public static boolean esPrimo(int numero) {
                if (numero <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
                return true;
            }

            public static int siguientePrimo(int numero) {
                numero++;
                while (!esPrimo(numero)) {
                    numero++;
                }
                return numero;
            }

            public static int potencia(int base, int exponente) {
                return (int) Math.pow(base, exponente);
            }

            public static int digitos(int numero) {
                return String.valueOf(Math.abs(numero)).length();
            }

            public static int voltea(int numero) {
                int invertido = 0;
                while (numero > 0) {
                    invertido = invertido * 10 + numero % 10;
                    numero /= 10;
                }
                return invertido;
            }

            public static int digitoN(int numero, int n) {
                String numStr = String.valueOf(numero);
                if (n >= 0 && n < numStr.length()) {
                    return Character.getNumericValue(numStr.charAt(n));
                }
                return -1;
            }

            public static int posicionDeDigito(int numero, int digito) {
                String numStr = String.valueOf(numero);
                return numStr.indexOf(String.valueOf(digito));
            }

            public static int quitaPorDetras(int numero, int n) {
                return numero / (int) Math.pow(10, n);
            }

            public static int quitaPorDelante(int numero, int n) {
                String numStr = String.valueOf(numero);
                return Integer.parseInt(numStr.substring(n));
            }

            public static int pegaPorDetras(int numero, int digito) {
                return Integer.parseInt(numero + String.valueOf(digito));
            }

            public static int pegaPorDelante(int numero, int digito) {
                return Integer.parseInt(digito + String.valueOf(numero));
            }

            public static int trozoDeNumero(int numero, int inicio, int fin) {
                String numStr = String.valueOf(numero);
                return Integer.parseInt(numStr.substring(inicio, fin + 1));
            }

            public static int juntaNumeros(int numero1, int numero2) {
                return Integer.parseInt(String.valueOf(numero1) + String.valueOf(numero2));
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int opcion;

                do {
                    // Menú de opciones
                    System.out.println("Selecciona una opción:");
                    System.out.println("1. Comprobar si es capicúa");
                    System.out.println("2. Comprobar si es primo");
                    System.out.println("3. Encontrar el siguiente número primo");
                    System.out.println("4. Calcular potencia");
                    System.out.println("5. Contar dígitos");
                    System.out.println("6. Voltear número");
                    System.out.println("7. Obtener dígito en la posición N");
                    System.out.println("8. Encontrar posición de un dígito");
                    System.out.println("9. Quitar dígitos por detrás");
                    System.out.println("10. Quitar dígitos por delante");
                    System.out.println("11. Añadir dígito por detrás");
                    System.out.println("12. Añadir dígito por delante");
                    System.out.println("13. Obtener trozo del número");
                    System.out.println("14. Juntar dos números");
                    System.out.println("0. Salir");

                    // Leer opción
                    opcion = sc.nextInt();

                    // Variable para almacenar resultados
                    int numero, resultado, digito, n, base, exponente, numero2;
                    switch (opcion) {
                        case 1:
                            // esCapicua
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.println("¿Es capicúa?: " + esCapicua(numero));
                            break;

                        case 2:
                            // esPrimo
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.println("¿Es primo?: " + esPrimo(numero));
                            break;

                        case 3:
                            // siguientePrimo
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.println("Siguiente primo: " + siguientePrimo(numero));
                            break;

                        case 4:
                            // potencia
                            System.out.print("Introduce la base: ");
                            base = sc.nextInt();
                            System.out.print("Introduce el exponente: ");
                            exponente = sc.nextInt();
                            System.out.println("Resultado: " + potencia(base, exponente));
                            break;

                        case 5:
                            // digitos
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.println("Número de dígitos: " + digitos(numero));
                            break;

                        case 6:
                            // voltea
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.println("Número volteado: " + voltea(numero));
                            break;

                        case 7:
                            // digitoN
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.print("Introduce la posición del dígito: ");
                            n = sc.nextInt();
                            System.out.println("Dígito en la posición " + n + ": " + digitoN(numero, n));
                            break;

                        case 8:
                            // posicionDeDigito
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.print("Introduce el dígito que quieres buscar: ");
                            digito = sc.nextInt();
                            System.out.println("Posición del dígito " + digito + ": " + posicionDeDigito(numero, digito));
                            break;

                        case 9:
                            // quitaPorDetras
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.print("¿Cuántos dígitos quieres quitar por detrás?: ");
                            n = sc.nextInt();
                            System.out.println("Resultado: " + quitaPorDetras(numero, n));
                            break;

                        case 10:
                            // quitaPorDelante
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.print("¿Cuántos dígitos quieres quitar por delante?: ");
                            n = sc.nextInt();
                            System.out.println("Resultado: " + quitaPorDelante(numero, n));
                            break;

                        case 11:
                            // pegaPorDetras
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.print("Introduce el dígito que quieres añadir por detrás: ");
                            digito = sc.nextInt();
                            System.out.println("Resultado: " + pegaPorDetras(numero, digito));
                            break;

                        case 12:
                            // pegaPorDelante
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.print("Introduce el dígito que quieres añadir por delante: ");
                            digito = sc.nextInt();
                            System.out.println("Resultado: " + pegaPorDelante(numero, digito));
                            break;

                        case 13:
                            // trozoDeNumero
                            System.out.print("Introduce un número: ");
                            numero = sc.nextInt();
                            System.out.print("Introduce la posición inicial: ");
                            int inicio = sc.nextInt();
                            System.out.print("Introduce la posición final: ");
                            int fin = sc.nextInt();
                            System.out.println("Resultado: " + trozoDeNumero(numero, inicio, fin));
                            break;

                        case 14:
                            // juntaNumeros
                            System.out.print("Introduce el primer número: ");
                            numero = sc.nextInt();
                            System.out.print("Introduce el segundo número: ");
                            numero2 = sc.nextInt();
                            System.out.println("Resultado: " + juntaNumeros(numero, numero2));
                            break;

                        case 0:
                            // Salir
                            System.out.println("Saliendo del programa...");
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }

                    System.out.println();  // Salto de línea

                } while (opcion != 0);

                sc.close();
            }
        }
