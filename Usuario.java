import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String contraseña;
    Scanner entrada = new Scanner(System.in);

   public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        boolean credencialesCorrectas = false;
        do {
            System.out.println("Ingrese su Usuario:");
            nombre = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            contraseña = scanner.nextLine();

            if (nombre.equals("admin") && contraseña.equals("1234")) {
                System.out.println("Acceso concedido");
                credencialesCorrectas = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos, intentelo de nuevo");
            }
        } while (!credencialesCorrectas); 
    }
}