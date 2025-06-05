package ejEduardo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class supMap {

    public static void main(String[] args) {

        // Mapa con los productos y sus precios
        Map<String, Double> precios = new HashMap<>();
        precios.put("avena", 2.21);
        precios.put("garbanzos", 2.39);
        precios.put("tomate", 1.59);
        precios.put("jengibre", 3.13);
        precios.put("quinoa", 4.50);
        precios.put("guisantes", 1.60);

        // Mapa con la compra acumulada (producto → cantidad)
        Map<String, Integer> compra = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        String producto;

        // Entrada de datos
        while (true) {
            System.out.print("Producto: ");
            producto = scanner.nextLine().toLowerCase();

            if (producto.equals("fin")) {
                break;
            }

            if (!precios.containsKey(producto)) {
                System.out.println("Producto no disponible.");
                continue;
            }

            System.out.print("Cantidad: ");
            int cantidad;

            try {
                cantidad = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Cantidad no válida.");
                continue;
            }

            // Acumular la cantidad
            compra.put(producto, compra.getOrDefault(producto, 0) + cantidad);
        }

        // Mostrar ticket por pantalla
        double total = 0.0;
        System.out.println("\nProducto      Precio   Cantidad   Subtotal");
        System.out.println("----------------------------------------------");

        for (String prod : compra.keySet()) {
            double precio = precios.get(prod);
            int cantidad = compra.get(prod);
            double subtotal = precio * cantidad;
            total += subtotal;

            System.out.printf("%-13s %.2f     %d         %.2f%n", prod, precio, cantidad, subtotal);
        }

        System.out.println("----------------------------------------------");
        System.out.printf("TOTAL: %.2f%n", total);

        // Escribir ticket en archivo
        try (PrintWriter pw = new PrintWriter(new FileWriter("ticket.txt"))) {
            pw.println("Producto      Precio   Cantidad   Subtotal");
            pw.println("----------------------------------------------");

            for (String prod : compra.keySet()) {
                double precio = precios.get(prod);
                int cantidad = compra.get(prod);
                double subtotal = precio * cantidad;

                pw.printf("%-13s %.2f     %d         %.2f%n", prod, precio, cantidad, subtotal);
            }

            pw.println("----------------------------------------------");
            pw.printf("TOTAL: %.2f%n", total);

            System.out.println("\nTicket guardado en 'ticket.txt'");

        } catch (IOException e) {
            System.out.println("Error al escribir el ticket: " + e.getMessage());
        }
    }
}

