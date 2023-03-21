package sesion4;

public interface Transferable {

	default void realizarTrans(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cambio) {
		cuentaOrigen.addSaldoTotCuenta(-cambio);
		cuentaDestino.addSaldoTotCuenta(cambio);
	}
	
	default void realizarTransCom(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cambio, double comision) {
		cuentaOrigen.addSaldoTotCuenta(-cambio);
		cuentaOrigen.addSaldoTotCuenta(-comision);
		cuentaDestino.addSaldoTotCuenta(cambio);
	}
	
}
