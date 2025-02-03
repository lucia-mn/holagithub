
// Clase main de Manuel Bernabé Peral
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final int nombreMax = 32;
    private static final int mailMax = 64;
    private static final String regexMail = "^[\\w.-]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";
    private static final String formatoFecha = "yyyy/MM/dd";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        boolean SALIR = false;
        while (!SALIR) {
            System.out.println("Introduce los datos del usuario (o escribe 'salir' en nombre para finalizar):");

            // Validar nombre
            String nombre;
            do {
                System.out.print("Nombre (máximo 32 caracteres): ");
                nombre = scanner.nextLine();
                if (nombre.equalsIgnoreCase("salir")) {
                    System.out.println("Saliendo...");
                    mostrarUsuarios(usuarios);
                    SALIR = true;
                    return;
                }
            } while (!validarNombre(nombre));

            // Validar correo
            String mail;
            do {
                System.out.print("Correo electrónico (máximo 64 caracteres): ");
                mail = scanner.nextLine();
            } while (!validarEmail(mail));

            // Validar fecha de registro
            String fRegistro;
            do {
                System.out.print("Fecha de registro (formato yyyy/MM/dd): ");
                fRegistro = scanner.nextLine();
            } while (!validarFecha(fRegistro));

            // Crear y agregar usuario
            usuarios.add(new Usuario(nombre, mail, fRegistro));
            System.out.println("Usuario agregado.\n");
        }
    }

    private static boolean validarNombre(String nombre) {
        if (nombre.length() > nombreMax) {
            System.out.println("Error: El nombre no puede exceder los 32 caracteres.");
            return false;
        }
        return true;
    }

    private static boolean validarEmail(String email) {
        if (email.length() > mailMax) {
            System.out.println("Error: El correo no puede exceder los 64 caracteres.");
            return false;
        }
        if (!Pattern.matches(regexMail, email)) {
            System.out.println("Error: Formato de correo inválido.");
            return false;
        }
        return true;
    }

    private static boolean validarFecha(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha);
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;
        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha inválido. Usa yyyy/MM/dd.");
            return false;
        }
    }

    private static void mostrarUsuarios(ArrayList<Usuario> usuarios) {
        System.out.println("\nLista de usuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre() + ", Email: " + usuario.getMail() + ", Fecha de Registro: " + usuario.getfRegistro());
        }
    }
}

