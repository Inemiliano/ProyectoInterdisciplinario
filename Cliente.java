import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Cliente {
    private int folio;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private String direccion;
    private int numDomicilio;
    ArrayList<Cliente> clientes = new ArrayList<>();
    public Cliente() {
        
    }
    public Cliente(int folio, String primerNombre,String segundoNombre, String apellidoP,String apellidoM, int edad, String direccion, int numDomicilio) {
        this.folio = folio;
        this.primerNombre= primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad=edad;
        this.direccion=direccion;
        this.numDomicilio=numDomicilio;
    }
    
    public int getFolio() {
        return folio;
    }
    public void setFolio(int folio) {
        this.folio = folio;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoM() {
        return apellidoM;
    }
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getnumDomicilio() {
        return numDomicilio;
    }
    public void setnumDomicilio(int numDomicilio) {
        this.numDomicilio = numDomicilio;
    }
    public void agregarCliente(Scanner scanner, ArrayList<Cliente> clientes) throws InputMismatchException {
        System.out.print("Ingrese el primer nombre del cliente: ");
        String primerNombre = scanner.next();
        System.out.print("Ingrese el segundo nombre del cliente (si no tiene, escriba N): ");
        String segundoNombre = scanner.next();  
        System.out.print(" Ingrese el apellido paterno del cliente: ");
        String apellidoPaterno = scanner.next();
        System.out.print("Ingrese el apellido materno del cliente: ");
        String apellidoMaterno = scanner.next();
    
        int edad = 0;
        while (edad == 0) {
            try {
                System.out.print("Ingrese su edad: ");
                edad = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("La edad debe ser un numero entero. Intente de nuevo.");
                scanner.next(); 
            }
        }
        scanner.nextLine(); 
    
        System.out.print("Ingrese su domicilio: ");
        String direccion = scanner.nextLine();
        int numDomicilio = 0;
        while (numDomicilio == 0) {
            try {
                System.out.print("Ingrese el número de su domicilio: ");
                numDomicilio = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El número del domicilio debe ser un numero entero. Intentelo de nuevo");
                scanner.next(); 
            }
        }
        int folio = (int) (Math.random() * 9000) + 1000;
    
        Cliente cliente = new Cliente(folio, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, edad, direccion, numDomicilio);
        clientes.add(cliente);
        System.out.println("Cliente agregado correctamente. Folio asignado: " + folio);
    }
    public void buscarCliente(Scanner scanner, ArrayList<Cliente> clientes) {
        try {
            System.out.print("Ingrese el folio del cliente: ");
            int folio = scanner.nextInt();
            boolean encontrado = false;
            for (int i = 0; i < clientes.size(); i++) {
                Cliente cliente = clientes.get(i);
                if (cliente.getFolio() == folio) {
                    System.out.println("Datos del cliente (folio: " + folio + "):");
                    System.out.println("Primer nombre: " + cliente.getPrimerNombre());
                    System.err.println("Segundo nombre: " + cliente.getSegundoNombre());
                    System.out.println("Apellido paterno: " + cliente.getApellidoP());
                    System.out.println("Apellido materno: " + cliente.getApellidoM());
                    System.out.println("Edad del cliente: " + cliente.getEdad());
                    System.out.println("El domicilio del cliente es: " + cliente.getDireccion());
                    System.out.println("El numero de su domicilio es: " + cliente.getnumDomicilio());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró ningún cliente con ese folio");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un valor numérico válido para el folio del cliente.");
            scanner.next(); 
        }
    }
}
