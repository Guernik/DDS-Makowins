package ventas.mock;

import makowins.Prenda;
import ventas.Venta;

public class VentasMock {

	public static Venta getVentaEfectivoPor114con50() {
		Venta venta = Venta.newVentaEfectivo();
		Prenda prenda = Prenda.newPrendaLiquidacion(200); // 100
		Prenda prenda1 = Prenda.newPrendaPromocion(20, 5.5d); // 14.5
		venta.addPrendaVendida(prenda);
		venta.addPrendaVendida(prenda1);
		return venta; // 114.5
	}

	public static Venta getVentaTarjetaPor305con50() {
		Venta venta = Venta.newVentaTarjeta(5, 0.5);
		Prenda prenda = Prenda.newPrendaNueva(200);
		Prenda prenda1 = Prenda.newPrendaNueva(100);
		venta.addPrendaVendida(prenda);
		venta.addPrendaVendida(prenda1);
		return venta; //
	}

}
