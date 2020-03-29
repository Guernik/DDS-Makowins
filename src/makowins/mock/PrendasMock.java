package makowins.mock;

import makowins.Prenda;

public class PrendasMock {

	public static Prenda getPrendaNuevaBase100() {
		return Prenda.newPrendaNueva(100d);
	}

	public static Prenda getPrendaPromoBase100Promo20() {
		return Prenda.newPrendaPromocion(100d, 20d);
	}

	public static Prenda getPrendaLiquiBase100() {
		return Prenda.newPrendaLiquidacion(100);
	}

}
