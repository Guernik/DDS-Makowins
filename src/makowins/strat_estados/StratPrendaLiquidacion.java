package makowins.strat_estados;

public class StratPrendaLiquidacion implements IEstadoPrendaStrategy {

	@Override
	public double getValorPrenda(double basePrice) {
		return (basePrice * 0.5d);
	}

}
