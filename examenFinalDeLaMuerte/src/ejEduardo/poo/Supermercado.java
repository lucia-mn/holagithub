package ejEduardo.poo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Supermercado {

    public static void main(String[] args) {
        Map<String, Producto> catalogo = new HashMap<>();
        catalogo.put("avena", new Producto("avena", 2.21));
        catalogo.put("garbanzos", new Producto("garbanzos", 2.39));
        catalogo.put("tomate", new Producto("tomate", 1.59));
        catalogo.put("jengibre", new Producto("jengibre", 3.13));
        catalogo.put("quinoa", new Producto("quinoa", 4.50));
        catalogo.put("guisantes", new Producto("guisantes", 1.60));

        Map<String, ItemCompra> carrito = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Producto: ");
            String nombreProducto = scanner.nextLine().toLowerCase();

            if (nombreProducto.equals("fin")) break;

            if (!catalogo.containsKey(nombreProducto)) {
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

            Producto producto = catalogo.get(nombreProducto);

            if (carrito.containsKey(nombreProducto)) {
                carrito.get(nombreProducto).sumarCantidad(cantidad);
            } else {
                carrito.put(nombreProducto, new ItemCompra(producto, cantidad));
            }
        }

        // Imprimir ticket
        System.out.println("\nProducto      Precio   Cantidad   Subtotal");
        System.out.println("------------------------------------------------");

        double total = 0;
        for (ItemCompra item : carrito.values()) {
            String nombre = item.getProducto().getNombre();
            double precio = item.getProducto().getPrecio();
            int cantidad = item.getCantidad();
            double subtotal = item.getSubtotal();
            total += subtotal;
            System.out.printf("%-13s %.2f     %d         %.2f%n", nombre, precio, cantidad, subtotal);
        }

        System.out.println("------------------------------------------------");
        System.out.printf("TOTAL: %.2f%n", total);

        // Guardar en archivo
        try (PrintWriter writer = new PrintWriter(new FileWriter("ticket_poo.txt"))) {
            writer.println("Producto      Precio   Cantidad   Subtotal");
            writer.println("------------------------------------------------");
            for (ItemCompra item : carrito.values()) {
                writer.printf("%-13s %.2f     %d         %.2f%n",
                        item.getProducto().getNombre(),
                        item.getProducto().getPrecio(),
                        item.getCantidad(),
                        item.getSubtotal());
            }
            writer.println("------------------------------------------------");
            writer.printf("TOTAL: %.2f%n", total);
            System.out.println("\nTicket guardado en 'ticket_poo.txt'");
        } catch (IOException e) {
            System.out.println("Error al guardar el ticket: " + e.getMessage());
        }
    }
}

