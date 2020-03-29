package makowins;

import makowins.strat_estados.IEstadoPrendaStrategy;
import makowins.strat_estados.StratPrendaLiquidacion;
import makowins.strat_estados.StratPrendaNueva;
import makowins.strat_estados.StratPrendaPromo;

public class Prenda {
	private ETiposPrenda tipoPrenda;
	private IEstadoPrendaStrategy estadoPrendaStrat;

	private double basePrice;

	private Prenda(double base_price, IEstadoPrendaStrategy estado_prenda_strat) {
		this.basePrice = base_price;
		this.estadoPrendaStrat = estado_prenda_strat;
	}

	public double getValorPrenda() {
		return this.estadoPrendaStrat.getValorPrenda(basePrice);
	}

	public ETiposPrenda getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(ETiposPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	/**
	 * Factory (o algo asi)
	 * 
	 * @param base_price
	 * @return
	 */
	public static Prenda newPrendaNueva(double base_price) {
		Prenda prenda = new Prenda(base_price, new StratPrendaNueva());
		return prenda;
	}

	public static Prenda newPrendaPromocion(double base_price, double valor_promocion) {
		Prenda prenda = new Prenda(base_price, new StratPrendaPromo(valor_promocion));
		return prenda;
	}

	public static Prenda newPrendaLiquidacion(double base_price) {
		Prenda prenda = new Prenda(base_price, new StratPrendaLiquidacion());
		return prenda;
	}

}
