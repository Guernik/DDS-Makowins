package ventas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import makowins.Prenda;
import ventas.strat_formapago.IFormaPagoStrategy;
import ventas.strat_formapago.StratPagoEfectivo;
import ventas.strat_formapago.StratPagoTarjeta;

public class Venta {
	private List<Prenda> prendasVendidas = new ArrayList<>();
	private LocalDate fechaVenta;
	private IFormaPagoStrategy formaPagoStrat;

	private Venta(IFormaPagoStrategy forma_pago_strat) {
		this.formaPagoStrat = forma_pago_strat;
	}

	public void addPrendaVendida(Prenda prenda) {
		this.prendasVendidas.add(prenda);
	}

	public double getVentaPrecioFinal() {
		double precio_final_base = this.prendasVendidas.stream().mapToDouble(Prenda::getValorPrenda).sum();

		// delego el calculo del precio final al strategy correspondiente, a partir de
		// la suma de todas las prendas
		return this.formaPagoStrat.getPrecioFinal(precio_final_base);
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public static Venta newVentaEfectivo() {
		return new Venta(new StratPagoEfectivo());
	}

	public static Venta newVentaTarjeta(Integer cuotas, double coeficiente) {
		return new Venta(new StratPagoTarjeta(cuotas, coeficiente));
	}

}
