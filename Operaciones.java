import java.util.Scanner;
import java.util.InputMismatchException;
public class Operaciones {
  private int monto;
  private int plazo;
  private int total; 
  private int montoDePago;
  private int opcion;
  private int folio;

  public void calcularMontoPago() { 
        Scanner scanner = new Scanner(System.in);
        String r;
        System.out.println("La taza de interes para todos los plazos de pago es del 10% por mes");
        System.out.println("Mientras mayor sea el plazo puede ser mayor el monto de prestamo");
        do {
            try {
                System.out.println("Ingrese el folio del cliente: ");
                folio = scanner.nextInt();
                System.out.println("Seleccione el plazo de pago que desea 1) 4 meses 2) 8 meses 3) 10 meses");
                plazo = scanner.nextInt();
                switch (plazo) {
                    case 1:
                        do {
                            System.out.println("La cantidad minima es de 7,000");
                            System.out.println("Ingrese el monto del prestamo: ");
                            monto = scanner.nextInt();
                        } while (monto < 7000);
                        total = monto * 10 / 100;
                        montoDePago = monto / 4 + total;
                        System.out.println("El monto de interes mensual es de: " + total);
                        System.out.println("El monto de pago es de " + montoDePago);
                        generarInformePrestamo();
                        break;
                    case 2:
                        do {
                            System.out.println("La cantidad minima es de 12,000 pesos");
                            System.out.println("Ingrese el monto del prestamo");
                            monto = scanner.nextInt();
                            
                        } while (monto < 12000);
                        total = monto * 10 / 100;
                        montoDePago = monto / 8 + total;
                        System.out.println("El monto de interes es de: " + total);
                        System.out.println("El monto de pago es de: " + montoDePago);
                        generarInformePrestamo();
                        break;
                    case 3:
                        do {
                            System.out.println("La cantidad minima es de 15,000 y la cantidad maxima es de 20,000");
                            System.out.println("Ingrese el monto del prestamo");
                            monto = scanner.nextInt();
                            if (monto < 15000 || monto > 20000) {
                                System.out.println("El monto debe estar entre 15,000 y 20,000 pesos");
                            }
                        } while (monto < 15000 || monto > 20000);
                        total = monto * 10 / 100;
                        montoDePago = monto / 10 + total;
                        System.out.println("El monto de interes es de: " + total);
                        System.out.println("El monto de pago es de: " + montoDePago);
                        generarInformePrestamo();
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                System.out.println("Digite Si para regresar el menú principal");
                r = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Error: solo se admiten numeros enteros");
                scanner.next(); 
                r = "Si"; 
            }
        } while (r.equals("Si"));
        
    }
public void generarInformePrestamo() {
    System.out.println("=== Informe de prestamo ===");
    System.out.println("El folio asignado al cliente es el: " + folio);
    System.out.println("Monto del préstamo: " + monto);
    System.out.println("Monto total a pagar mensualmente: " + montoDePago);
}
}

