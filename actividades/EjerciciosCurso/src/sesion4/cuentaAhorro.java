package sesion4;

public class cuentaAhorro extends Cuenta {

	double comisiones[];
	
	public cuentaAhorro(String dni, int numCuenta, double saldoTotCuenta, double[] comisiones) {
		super(dni, numCuenta, saldoTotCuenta);
		
	}

	public double[] getComisiones() {
		return comisiones;
	}

	public void setComisiones(double[] comisiones) {
		this.comisiones = comisiones;
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
	
	public void realizarTransCom(Cuenta cuenta, double cambio) {
		if(cambio < this.getSaldoTotCuenta()) {
			this.setSaldoTotCuenta(this.getSaldoTotCuenta() - (cambio*0.1));
			cuenta.addSaldoTotCuenta(cambio);
		}
	}

}
