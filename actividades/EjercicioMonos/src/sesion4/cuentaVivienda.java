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

	@Override
	public String getDni() {
		// TODO Auto-generated method stub
		return super.getDni();
	}

	@Override
	public void setDni(String dni) {
		// TODO Auto-generated method stub
		super.setDni(dni);
	}

	@Override
	public int getNumCuenta() {
		// TODO Auto-generated method stub
		return super.getNumCuenta();
	}

	@Override
	public void setNumCuenta(int numCuenta) {
		// TODO Auto-generated method stub
		super.setNumCuenta(numCuenta);
	}

	@Override
	public void setSaldoTotCuenta(double saldoTotCuenta) {
		// TODO Auto-generated method stub
		super.setSaldoTotCuenta(saldoTotCuenta);
	}

	@Override
	public double getSaldoTotCuenta() {
		// TODO Auto-generated method stub
		return super.getSaldoTotCuenta();
	}

	@Override
	public void addSaldoTotCuenta(double saldoTotCuenta) {
		// TODO Auto-generated method stub
		super.addSaldoTotCuenta(saldoTotCuenta);
	}
	
	public void restarHipoteca(double cantidad) {
		
	}

}
