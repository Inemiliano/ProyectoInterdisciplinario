import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pago> pagos = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    public static void main(String[] args) {
    menu();
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Cliente obj1 = new Cliente();
        Cliente obj2 = new Cliente();
        Usuario obj3 = new Usuario();
        Operaciones obj4 = new Operaciones();
        obj3.iniciarSesion();
        while (true) {
            try {
                System.out.println("=== Menú ===");
                System.out.println("1. Agregar cliente");
                System.out.println("2. Buscar cliente por folio");
                System.out.println("3. Realizar prestamos");
                System.out.println("4. Ingresar pagos o ver informe de pagos");
                System.err.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        obj1.agregarCliente(scanner, clientes);
                        break;
                    case 2:
                        obj2.buscarCliente(scanner, clientes);
                        break;
                    case 3:
                        obj4.calcularMontoPago();
                        break;
                    case 4:
                        System.out.println("Seleccione el tipo de pago:");
                        System.out.println("1) Pago sin retraso");
                        System.out.println("2) Pago con retraso");
                        System.out.println("3) Generar informe de pagos");
                        int tipoPago = scanner.nextInt();
                        switch (tipoPago) {
                            case 1:
                                PagoSinRetraso pagoSinRetraso = new PagoSinRetraso();
                                pagoSinRetraso.registrarPago(pagos);
                                break;
                            case 2:
                                PagoConRetraso pagoConRetraso = new PagoConRetraso();
                                pagoConRetraso.registrarPago(pagos);
                                break;
                            case 3:
                                PagoSinRetraso pagoSinRetraso2 = new PagoSinRetraso();
                                pagoSinRetraso2.imprimirInformePagos(pagos);
                                break;
                            default:
                                System.out.println("Opción invalida. Seleccione una opción valida");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opción invalida. Seleccione una opción valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
                scanner.next(); 
            }
        }
    }
}

