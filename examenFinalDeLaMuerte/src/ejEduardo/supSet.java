package ejEduardo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class supSet {

    public static void main(String[] args) {

        Map<String, Double> precios = new HashMap<>();
        precios.put("avena", 2.21);
        precios.put("garbanzos", 2.39);
        precios.put("tomate", 1.59);
        precios.put("jengibre", 3.13);
        precios.put("quinoa", 4.50);
        precios.put("guisantes", 1.60);

        Set<String> compra = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Producto: ");
            String producto = scanner.nextLine().toLowerCase();

            if (producto.equals("fin")) break;

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

            // Añadir o actualizar el producto en el set
            // Buscamos si ya existe el producto en el set:
            String productoExistente = null;
            for (String item : compra) {
                if (item.startsWith(producto + ";")) {
                    productoExistente = item;
                    break;
                }
            }

            if (productoExistente != null) {
                // Extraemos la cantidad vieja
                int cantidadVieja = Integer.parseInt(productoExistente.split(";")[1]);
                // Eliminamos la antigua línea
                compra.remove(productoExistente);
                // Añadimos la nueva con cantidad actualizada
                compra.add(producto + ";" + (cantidadVieja + cantidad));
            } else {
                compra.add(producto + ";" + cantidad);
            }
        }

        // Mostrar ticket
        System.out.println("\nProducto      Precio   Cantidad   Subtotal");
        System.out.println("----------------------------------------------");

        double total = 0.0;
        for (String item : compra) {
            String[] partes = item.split(";");
            String prod = partes[0];
            int cant = Integer.parseInt(partes[1]);
            double precio = precios.get(prod);
            double subtotal = precio * cant;
            total += subtotal;
            System.out.printf("%-13s %.2f     %d         %.2f%n", prod, precio, cant, subtotal);
        }

        System.out.println("----------------------------------------------");
        System.out.printf("TOTAL: %.2f%n", total);

        // Guardar ticket en archivo
        try (PrintWriter pw = new PrintWriter(new FileWriter("ticket_set.txt"))) {
            pw.println("Producto      Precio   Cantidad   Subtotal");
            pw.println("----------------------------------------------");
            for (String item : compra) {
                String[] partes = item.split(";");
                String prod = partes[0];
                int cant = Integer.parseInt(partes[1]);
                double precio = precios.get(prod);
                double subtotal = precio * cant;
                pw.printf("%-13s %.2f     %d         %.2f%n", prod, precio, cant, subtotal);
            }
            pw.println("----------------------------------------------");
            pw.printf("TOTAL: %.2f%n", total);
            System.out.println("\nTicket guardado en 'ticket_set.txt'");
        } catch (IOException e) {
            System.out.println("Error al escribir el ticket: " + e.getMessage());
        }
    }
}

