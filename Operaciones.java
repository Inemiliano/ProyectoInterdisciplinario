import java.util.Scanner;
import java.util.InputMismatchException;
public class Operaciones {
  private  int monto;
  private  int plazo;
  private  int total; 
  private  int montoDePago;
  private  int opcion;

  public void calcularMontoPago() {
    
        Scanner scanner = new Scanner(System.in);
        String r;
        do {
            try {
                System.out.println("La taza de interes para todos los plazos de pago es del 10% por mes");
                System.out.println("Seleccione el plazo de pago que desea 1) 4 meses 2) 8 meses 3) 10 meses");
                plazo = scanner.nextInt();
                switch (plazo) {
                    case 1:
                        do {
                            System.out.println("La cantidad minima es de 15,000");
                            System.out.println("Ingrese el monto del prestamo: ");
                            monto = scanner.nextInt();
                        } while (monto < 15000);
                        total = monto * 10 / 100;
                        montoDePago = monto / 4 + total;
                        System.out.println("El monto de interes mensual es de: " + total);
                        System.out.println("El monto de pago es de " + montoDePago);
                        break;
                    case 2:
                        do {
                            System.out.println("La cantidad minima es de 30,000 pesos");
                            System.out.println("Ingrese el monto del prestamo");
                            monto = scanner.nextInt();
                        } while (monto < 30000);
                        total = monto * 10 / 100;
                        montoDePago = monto / 8 + total;
                        System.out.println("El monto de interes es de: " + total);
                        System.out.println("El monto de pago es de: " + montoDePago);
                        break;
    
                    case 3:
                        do {
                            System.out.println("La cantidad minima es de 50,000");
                            System.out.println("Ingrese el monto del prestamo");
                            monto = scanner.nextInt();
                        } while (monto < 50000);
                        total = monto * 10 / 100;
                        montoDePago = monto / 10 + total;
                        System.out.println("El monto de interes es de: " + total);
                        System.out.println("El monto de pago es de: " + montoDePago);
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                System.out.println("Digite Si para regresar el menú principal");
                r = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un un numero correspondiente al de una de las opciones");
                scanner.next(); 
                r = "Si"; 
            }
        } while (r.equals("Si"));
    }
public void generarInformePrestamo() {
    System.out.println("=== Informe de prestamo ===");
    System.out.println("Monto del préstamo: " + monto);
    System.out.println("Monto total a pagar mensualmente: " + total);
}
}