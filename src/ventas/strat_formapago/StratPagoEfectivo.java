package ventas.strat_formapago;

public class StratPagoEfectivo implements IFormaPagoStrategy {

	@Override
	public double getPrecioFinal(double precio_final_base) {
		return precio_final_base;
	}

}
