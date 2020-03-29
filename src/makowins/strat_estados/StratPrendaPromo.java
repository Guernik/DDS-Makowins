package makowins.strat_estados;

public class StratPrendaPromo implements IEstadoPrendaStrategy {

	private double promoValue;

	public StratPrendaPromo(double promo_value) {
		this.promoValue = promo_value;
	}

	@Override
	public double getValorPrenda(double basePrice) {
		return basePrice - promoValue;
	}

}
