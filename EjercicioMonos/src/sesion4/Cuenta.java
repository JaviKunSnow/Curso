package sesion4;

public class Cuenta implements Transferable {

	protected String dni;
	protected int numCuenta;
	protected double saldoTotCuenta;
	
	public Cuenta(String dni, int numCuenta, double saldoTotCuenta) {
		this.dni = dni;
		this.numCuenta = numCuenta;
		this.saldoTotCuenta = saldoTotCuenta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public void setSaldoTotCuenta(double saldoTotCuenta) {
		this.saldoTotCuenta = saldoTotCuenta;
	}

	public double getSaldoTotCuenta() {
		return saldoTotCuenta;
	}

	public void addSaldoTotCuenta(double saldoTotCuenta) {
		this.saldoTotCuenta += saldoTotCuenta;
	}
	

	
	
}
