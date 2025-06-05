package ejEduardo.pooAlmacen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SupermercadoApp {

    static Map<String, Producto> almacen = new HashMap<>();
    static List<Compra> carrito = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarAlmacen();
        menuPrincipal();
    }

    private static void inicializarAlmacen() {
        almacen.put("avena", new Producto("avena", 2.21));
        almacen.put("garbanzos", new Producto("garbanzos", 2.39));
        almacen.put("tomate", new Producto("tomate", 1.59));
        almacen.put("jengibre", new Producto("jengibre", 3.13));
        almacen.put("quinoa", new Producto("quinoa", 4.50));
        almacen.put("guisantes", new Producto("guisantes", 1.60));
    }

    private static void menuPrincipal() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n==== MENÚ PRINCIPAL ====");
            System.out.println("1. Gestionar almacén");
            System.out.println("2. Realizar compra");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> menuAlmacen();
                case 2 -> realizarCompra();
                case 0 -> salir = true;
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarProductosAlmacen() {
        if (almacen.isEmpty()) {
            System.out.println("No hay productos en el almacén.");
            return;
        }
        System.out.println("Productos disponibles:");
        int i = 1;
        for (Producto p : almacen.values()) {
            System.out.printf("%d. %s (%.2f €)\n", i++, p.getNombre(), p.getPrecio());
        }
    }

    private static void menuAlmacen() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n== GESTIÓN DE ALMACÉN ==");
            mostrarProductosAlmacen();  // Mostrar listado antes de pedir opción
            System.out.println("1. Añadir producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Cambiar nombre");
            System.out.println("4. Cambiar precio");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> anadirProducto();
                case 2 -> {
                    System.out.print("Número del producto a eliminar: ");
                    int numEliminar = scanner.nextInt();
                    scanner.nextLine();
                    List<String> claves = new ArrayList<>(almacen.keySet());
                    if (numEliminar >= 1 && numEliminar <= claves.size()) {
                        almacen.remove(claves.get(numEliminar - 1));
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }
                case 3 -> {
                    System.out.print("Número del producto a renombrar: ");
                    int numRenombrar = scanner.nextInt();
                    scanner.nextLine();
                    List<Producto> lista = new ArrayList<>(almacen.values());
                    if (numRenombrar >= 1 && numRenombrar <= lista.size()) {
                        Producto p = lista.get(numRenombrar - 1);
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        String claveVieja = p.getNombre().toLowerCase();
                        p.setNombre(nuevoNombre);
                        almacen.remove(claveVieja);
                        almacen.put(nuevoNombre.toLowerCase(), p);
                        System.out.println("Nombre actualizado.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }
                case 4 -> {
                    System.out.print("Número del producto para cambiar precio: ");
                    int numPrecio = scanner.nextInt();
                    scanner.nextLine();
                    List<Producto> lista = new ArrayList<>(almacen.values());
                    if (numPrecio >= 1 && numPrecio <= lista.size()) {
                        Producto p = lista.get(numPrecio - 1);
                        System.out.print("Nuevo precio: ");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine();
                        p.setPrecio(nuevoPrecio);
                        System.out.println("Precio actualizado.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }
                case 0 -> volver = true;
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private static void anadirProducto() {
        System.out.print("Nombre del nuevo producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        almacen.put(nombre.toLowerCase(), new Producto(nombre, precio));
        System.out.println("Producto añadido correctamente.");
    }

    private static void eliminarProducto() {
        System.out.print("Nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();
        if (almacen.remove(nombre.toLowerCase()) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void cambiarNombre() {
        System.out.print("Producto a renombrar: ");
        String viejoNombre = scanner.nextLine();
        Producto producto = almacen.get(viejoNombre.toLowerCase());
        if (producto != null) {
            System.out.print("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();
            producto.setNombre(nuevoNombre);
            almacen.remove(viejoNombre.toLowerCase());
            almacen.put(nuevoNombre.toLowerCase(), producto);
            System.out.println("Nombre actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void cambiarPrecio() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        Producto producto = almacen.get(nombre.toLowerCase());
        if (producto != null) {
            System.out.print("Nuevo precio: ");
            double nuevoPrecio = scanner.nextDouble();
            scanner.nextLine();
            producto.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void realizarCompra() {
        carrito.clear();
        List<Producto> listaProductos = new ArrayList<>(almacen.values());

        while (true) {
            System.out.println("\nProductos disponibles para comprar:");
            mostrarProductosAlmacen();
            System.out.print("Elige el número del producto (o 0 para terminar): ");
            int numProducto = scanner.nextInt();
            scanner.nextLine();
            if (numProducto == 0) break;

            if (numProducto < 1 || numProducto > listaProductos.size()) {
                System.out.println("Número inválido.");
                continue;
            }
            Producto producto = listaProductos.get(numProducto - 1);

            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            agregarAlCarrito(producto, cantidad);
        }

        System.out.print("Descuento (%) a aplicar (0 si ninguno): ");
        double descuento = scanner.nextDouble();
        scanner.nextLine();
        generarTicket(descuento);
    }

    private static void agregarAlCarrito(Producto producto, int cantidad) {
        for (Compra compra : carrito) {
            if (compra.getProducto().getNombre().equalsIgnoreCase(producto.getNombre())) {
                compra.aumentarCantidad(cantidad);
                return;
            }
        }
        carrito.add(new Compra(producto, cantidad));
    }

    private static void generarTicket(double descuento) {
        double total = 0;
        System.out.println("\nProducto\tPrecio\tCantidad\tSubtotal");
        System.out.println("-------------------------------------------");
        for (Compra compra : carrito) {
            double subtotal = compra.getSubtotal();
            total += subtotal;
            System.out.printf("%s\t%.2f\t%d\t\t%.2f\n",
                    compra.getProducto().getNombre(),
                    compra.getProducto().getPrecio(),
                    compra.getCantidad(),
                    subtotal);
        }
        double descuentoFinal = total * (descuento / 100);
        double totalFinal = total - descuentoFinal;
        System.out.println("-------------------------------------------");
        System.out.printf("TOTAL: %.2f (-%.2f de descuento) = %.2f\n", total, descuentoFinal, totalFinal);

        exportarTicket(total, descuentoFinal, totalFinal);
    }

    private static void exportarTicket(double total, double descuento, double totalFinal) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("ticket.txt"))) {
            writer.println("Producto\tPrecio\tCantidad\tSubtotal");
            for (Compra compra : carrito) {
                double subtotal = compra.getSubtotal();
                writer.printf("%s\t%.2f\t%d\t\t%.2f\n",
                        compra.getProducto().getNombre(),
                        compra.getProducto().getPrecio(),
                        compra.getCantidad(),
                        subtotal);
            }
            writer.println("-------------------------------------------");
            writer.printf("TOTAL: %.2f (-%.2f de descuento) = %.2f\n", total, descuento, totalFinal);
            System.out.println("\nTicket exportado a ticket.txt con éxito.");
        } catch (IOException e) {
            System.out.println("Error al guardar el ticket: " + e.getMessage());
        }

    }
}

