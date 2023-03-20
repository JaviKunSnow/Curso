package sesion4;

public class cuentaNomina extends Cuenta {

	public cuentaNomina(String dni, int numCuenta, double saldoTotCuenta) {
		super(dni, numCuenta, saldoTotCuenta);
		
	}

	@Override
	public double getSaldoTotCuenta() {
		return super.getSaldoTotCuenta();
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
	public void addSaldoTotCuenta(double saldoTotCuenta) {
		if(saldoTotCuenta > 1500.0) {
			this.saldoTotCuenta += (saldoTotCuenta*0.01);
		} else {
			this.saldoTotCuenta += saldoTotCuenta;
		}
		
	}

	public void llamaRealizarTrans(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cambio) {
		realizarTrans(this, cuentaDestino, cambio);
	}

	public void llamaRealizarTransCom(Cuenta cuentaDestino, Cuenta cuentaOrigen, double cambio, double comision) {
		// TODO Auto-generated method stub
		realizarTransCom(this, cuentaOrigen, cambio, comision);
	}

	

		

}
