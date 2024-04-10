import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PagoSinRetraso extends Pago {
    public PagoSinRetraso() {
        super();
    }

    public PagoSinRetraso(int folioCliente, double monto) {
        super(folioCliente, monto);
    }

    @Override
    public void registrarPago(ArrayList<Pago> pagos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el folio del cliente: ");
        int folio;
        try {
            folio = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un valor numérico válido para el folio");
            scanner.next();
            return;
        }
        double monto;
        String otroPago;
        do {
            try {
                
                System.out.print("Ingrese el monto del pago: ");
                monto = scanner.nextDouble();
    
                do {
                    if (monto <= 0) {
                        System.out.println("No se aceptan cantidades negativas o iguales a 0, ingrese una cantidad superior a 0");
                    } else {
                        PagoSinRetraso pago = new PagoSinRetraso(folio, monto);
                        pagos.add(pago);
                        System.out.println("Pago registrado correctamente.");
                    }
                } while (monto <= 0);
                System.out.print("Digite Si para regresar el menú principal");
                otroPago = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numérico válido para el monto del pago");
                scanner.next(); 
                otroPago = "Si";
            }
        } while (otroPago.equals("Si"));
    }
    @Override
    public void imprimirInformePagos(ArrayList<Pago> pagos) {
        System.out.println("Informe de pagos:");
        for (int i = 0; i < pagos.size(); i++) {
            Pago pago = pagos.get(i);
            System.out.println("Folio del cliente: " + pago.getFolioCliente() + ", Monto: " + pago.getMonto());
        }
    }
}
