package makowins.strat_estados;

public class StratPrendaNueva implements IEstadoPrendaStrategy {

	@Override
	public double getValorPrenda(double basePrice) {
		return basePrice;
	}

}
