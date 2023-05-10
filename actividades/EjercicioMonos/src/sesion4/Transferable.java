package sesion4;

public interface Transferable {

	default void realizarTrans(Cuenta cuenta, double cambio) {
			((Cuenta) this).addSaldoTotCuenta(-cambio);
			cuenta.addSaldoTotCuenta(cambio);
	}
	
	default void realizarTransCom(Cuenta cuenta, double cambio) {
		((Cuenta) this).addSaldoTotCuenta(-cambio*0.01);
		cuenta.addSaldoTotCuenta(cambio);
	}
	
}
