package ejerciciosFicheros.ej9;

import ejemploFBinario.Artista;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ej9 {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("74441630Z", "Lucía", 21, 00.0);

        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/empleados.bin");
        Scanner scan = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce el dni: ");
            String dni = scan.nextLine();
            System.out.println("Introduce el nombre: ");
            String nombre = scan.nextLine();
            System.out.println("Introduce la edad");
            int edad = scan.nextInt();
            System.out.println("Introduce el sueldo: ");
            double sueldo = scan.nextDouble();
            scan.nextLine();

            empleados.add(new Empleado(dni, nombre, edad, sueldo));
        }

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Empleado e : empleados) {
                oos.writeObject(e);
            }

            fos.close();
            oos.close();
            System.out.println("MUY BIEN");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
