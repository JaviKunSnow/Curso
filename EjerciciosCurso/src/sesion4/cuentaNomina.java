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
			this.setSaldoTotCuenta(this.getSaldoTotCuenta() -= cambio);
			cuenta.addSaldoTotCuenta(cambio);
		}
	}	

}
