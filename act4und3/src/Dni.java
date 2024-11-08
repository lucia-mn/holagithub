import java.util.Scanner;
import java.util.InputMismatchException;

/*public class Dni {

    /*private static boolean esNumero (String dni) {
        for (int i = 0; i < dni.length(); i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        try {
            while (salir == false) {

                System.out.println("Introduce tu DNI:");
                int dniLetra = sc.nextInt();

                String dniString = Integer.toString(dniLetra);

                if (dniString.length() <= 8 && esNumero(dniString)) {
                    System.out.println("Tienen que ser 8 números");

                } else {
                    int dniLetra2 = Integer.parseInt(dniString);

                    if (dniLetra2 % 23 == 0) {
                        System.out.println("El DNI es: " + dniLetra2 + " T");
                        salir = true;

                    } else if (dniLetra2 % 23 == 1) {
                        System.out.println("El DNI es: " + dniLetra2 + " R");
                        salir = true;

                    } else if (dniLetra2 % 23 == 2) {
                        System.out.println("El DNI es: " + dniLetra2 + " W");
                        salir = true;

                    } else if (dniLetra2 % 23 == 3) {
                        System.out.println("El DNI es: " + dniLetra2 + " A");
                        salir = true;

                    } else if (dniLetra2 % 23 == 4) {
                        System.out.println("El DNI es: " + dniLetra2 + " G");
                        salir = true;

                    } else if (dniLetra2 % 23 == 5) {
                        System.out.println("El DNI es: " + dniLetra2 + " M");
                        salir = true;

                    } else if (dniLetra2 % 23 == 6) {
                        System.out.println("El DNI es: " + dniLetra2 + " Y");
                        salir = true;

                    } else if (dniLetra2 % 23 == 7) {
                        System.out.println("El DNI es: " + dniLetra2 + " F");
                        salir = true;

                    } else if (dniLetra2 % 23 == 8) {
                        System.out.println("El DNI es: " + dniLetra2 + " P");
                        salir = true;

                    } else if (dniLetra2 % 23 == 9) {
                        System.out.println("El DNI es: " + dniLetra2 + " D");
                        salir = true;

                    } else if (dniLetra2 % 23 == 10) {
                        System.out.println("El DNI es: " + dniLetra2 + " X");
                        salir = true;

                    } else if (dniLetra2 % 23 == 11) {
                        System.out.println("El DNI es: " + dniLetra2 + " B");
                        salir = true;

                    } else if (dniLetra2 % 23 == 12) {
                        System.out.println("El DNI es: " + dniLetra2 + " N");
                        salir = true;

                    } else if (dniLetra2 % 23 == 13) {
                        System.out.println("El DNI es: " + dniLetra2 + " J");
                        salir = true;

                    } else if (dniLetra2 % 23 == 14) {
                        System.out.println("El DNI es: " + dniLetra2 + " Z");
                        salir = true;

                    } else if (dniLetra2 % 23 == 15) {
                        System.out.println("El DNI es: " + dniLetra2 + " S");
                        salir = true;

                    } else if (dniLetra2 % 23 == 16) {
                        System.out.println("El DNI es: " + dniLetra2 + " Q");
                        salir = true;

                    } else if (dniLetra2 % 23 == 17) {
                        System.out.println("El DNI es: " + dniLetra2 + " V");
                        salir = true;

                    } else if (dniLetra2 % 23 == 18) {
                        System.out.println("El DNI es: " + dniLetra2 + " H");
                        salir = true;

                    } else if (dniLetra2 % 23 == 19) {
                        System.out.println("El DNI es: " + dniLetra2 + " L");
                        salir = true;

                    } else if (dniLetra2 % 23 == 20) {
                        System.out.println("El DNI es: " + dniLetra2 + " C");
                        salir = true;

                    } else if (dniLetra2 % 23 == 21) {
                        System.out.println("El DNI es: " + dniLetra2 + " K");
                        salir = true;

                    } else {
                        System.out.println("El DNI es: " + dniLetra2 + " E");
                        salir = true;
                    }

                    sc.close();
                }
            }


        } catch(InputMismatchException error) {
            System.out.println("Son 8 números y sin letra");
            sc.nextLine();
        }

    }
}*/


public class Dni {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir=false;

        while (salir==false) {

            try {
                System.out.println("Introduce tu DNI:");

                int dniLetra = sc.nextInt();

                String dniString = Integer.toString(dniLetra);

                if (dniString.length() != 8) {
                    System.out.println("Tienen que ser 8 números");

                } else {
                    int dniLetra2=Integer.parseInt(dniString);

                    if (dniLetra2%23==0){
                        System.out.println("El DNI es: " + dniLetra2 + " T");
                        salir=true;

                    }else if (dniLetra2%23==1){
                        System.out.println("El DNI es: " + dniLetra2 + " R");
                        salir=true;

                    }else if (dniLetra2%23==2){
                        System.out.println("El DNI es: " + dniLetra2 + " W");
                        salir=true;

                    }else if (dniLetra2%23==3){
                        System.out.println("El DNI es: " + dniLetra2 + " A");
                        salir=true;

                    }else if (dniLetra2%23==4){
                        System.out.println("El DNI es: " + dniLetra2 + " G");
                        salir=true;

                    }else if (dniLetra2%23==5){
                        System.out.println("El DNI es: " + dniLetra2 + " M");
                        salir=true;

                    }else if (dniLetra2%23==6){
                        System.out.println("El DNI es: " + dniLetra2 + " Y");
                        salir=true;

                    }else if (dniLetra2%23==7){
                        System.out.println("El DNI es: " + dniLetra2 + " F");
                        salir=true;

                    }else if (dniLetra2%23==8){
                        System.out.println("El DNI es: " + dniLetra2 + " P");
                        salir=true;

                    }else if (dniLetra2%23==9){
                        System.out.println("El DNI es: " + dniLetra2 + " D");
                        salir=true;

                    }else if (dniLetra2%23==10){
                        System.out.println("El DNI es: " + dniLetra2 + " X");
                        salir=true;

                    }else if (dniLetra2%23==11){
                        System.out.println("El DNI es: " + dniLetra2 + " B");
                        salir=true;

                    }else if (dniLetra2%23==12){
                        System.out.println("El DNI es: " + dniLetra2 + " N");
                        salir=true;

                    }else if (dniLetra2%23==13){
                        System.out.println("El DNI es: " + dniLetra2 + " J");
                        salir=true;

                    }else if (dniLetra2%23==14){
                        System.out.println("El DNI es: " + dniLetra2 + " Z");
                        salir=true;

                    }else if (dniLetra2%23==15){
                        System.out.println("El DNI es: " + dniLetra2 + " S");
                        salir=true;

                    }else if (dniLetra2%23==16){
                        System.out.println("El DNI es: " + dniLetra2 + " Q");
                        salir=true;

                    }else if (dniLetra2%23==17){
                        System.out.println("El DNI es: " + dniLetra2 + " V");
                        salir=true;

                    }else if (dniLetra2%23==18){
                        System.out.println("El DNI es: " + dniLetra2 + " H");
                        salir=true;

                    }else if (dniLetra2%23==19){
                        System.out.println("El DNI es: " + dniLetra2 + " L");
                        salir=true;

                    }else if (dniLetra2%23==20){
                        System.out.println("El DNI es: " + dniLetra2 + " C");
                        salir=true;

                    }else if (dniLetra2%23==21){
                        System.out.println("El DNI es: " + dniLetra2 + " K");
                        salir=true;

                    }else {
                        System.out.println("El DNI es: " + dniLetra2 + " E");
                        salir=true;
                    }
                    sc.nextLine();
                }

            } catch (InputMismatchException error) {
                System.out.println("Son 8 números y sin letra");
                sc.nextLine();
            }

        }
        System.out.println("Fin del programa");
    }
}

