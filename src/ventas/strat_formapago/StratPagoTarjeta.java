package ventas.strat_formapago;

public class StratPagoTarjeta implements IFormaPagoStrategy {

	private Integer cantCuotas;
	private double coeficiente;

	public StratPagoTarjeta(Integer cant_cuotas, double coeficiente) {
		this.cantCuotas = cant_cuotas;
		this.coeficiente = coeficiente;

	}

	@Override
	public double getPrecioFinal(double precio_final_base) {
		return (cantCuotas * coeficiente) + (0.01d * precio_final_base) + precio_final_base;
	}

}
