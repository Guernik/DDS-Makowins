package makowins2.mock;

import makowins2.PrendaLiquidacion;
import makowins2.PrendaNueva;
import makowins2.PrendaPromo;

public class PrendasMock {

	public static PrendaNueva getPrendaNuevaBase100() {
		return new PrendaNueva(100d);
	}

	public static PrendaPromo getPrendaPromoBase100Promo20() {
		return new PrendaPromo(100d, 20d);
	}

	public static PrendaLiquidacion getPrendaLiquiBase100() {
		return new PrendaLiquidacion(100);
	}

}
