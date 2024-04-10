import java.util.ArrayList;

public abstract class Pago {
    protected int folioCliente;
    protected double monto;

   private ArrayList<Pago>pagos;


    public Pago() {
        pagos= new ArrayList<>();
    }

    public Pago(int folioCliente, double monto) {
        this.folioCliente = folioCliente;
        this.monto = monto;
      
    }
    public ArrayList<Pago> getPagos() {
        return pagos;
    }
    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

    public int getFolioCliente() {
        return folioCliente;
    }
    public void setFolioCliente(int folioCliente) {
        this.folioCliente = folioCliente;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    } 
    public abstract void registrarPago(ArrayList<Pago> pagos);
    public abstract void imprimirInformePagos(ArrayList<Pago> pagos);
}
