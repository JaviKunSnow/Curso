package sesion4;

public class cuentaVivienda extends Cuenta {

	double hipoteca_total;
	
	public cuentaVivienda(String dni, int numCuenta, double saldoTotCuenta, double hipoteca_total) {
		super(dni, numCuenta, saldoTotCuenta);
		this.hipoteca_total = hipoteca_total;
	}

	public double getHipoteca_total() {
		return hipoteca_total;
	}

	public void setHipoteca_total(double hipoteca_total) {
		this.hipoteca_total = hipoteca_total;
	}
	
	

}
