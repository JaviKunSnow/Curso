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
		if(saldoTotCuenta > 1500) {
			this.addSaldoTotCuenta(saldoTotCuenta*0.01);
		} else {
			this.addSaldoTotCuenta(saldoTotCuenta*0.01);;
		}
		
	}

	@Override
	public void realizarTransCom(Cuenta cuenta, double cambio) {
		if(cambio < this.getSaldoTotCuenta()) {
			this.setSaldoTotCuenta(this.getSaldoTotCuenta() - (cambio*0.005));
			cuenta.addSaldoTotCuenta(cambio);
		}
	}

		

}
