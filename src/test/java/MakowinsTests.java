package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ventas.mock.VentasMock;

class MakowinsTests {

	@Test
	@DisplayName("venta Con Efectivo")
	void ventaConEfectivo() {
		double precio_final = VentasMock.getVentaEfectivoPor114con50().getVentaPrecioFinal();
		assertEquals(114.5d, precio_final);
	}

	@Test
	@DisplayName("ventaConTarjeta")
	void ventaConTarjeta() {
		double precio_final = VentasMock.getVentaTarjetaPor305con50().getVentaPrecioFinal();
		assertEquals(305.5d, precio_final);
	}

}
