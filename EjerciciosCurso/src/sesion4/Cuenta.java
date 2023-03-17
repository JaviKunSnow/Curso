package sesion4;

public class Cuenta {

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
	
	public void realizarTrans(Cuenta cuenta, double cambio) {
		if(cambio < this.saldoTotCuenta) {
			this.saldoTotCuenta -= cambio;
			cuenta.addSaldoTotCuenta(cambio);
		}
	}
	
	public void realizarTransCom(Cuenta cuenta, double cambio) {
		if(cambio < this.saldoTotCuenta) {
			this.saldoTotCuenta -= cambio*0.01;
			cuenta.addSaldoTotCuenta(cambio);
		}
	}
	
	
}
