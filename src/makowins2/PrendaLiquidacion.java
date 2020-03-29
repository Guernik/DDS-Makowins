package makowins2;

public class PrendaLiquidacion extends AbstractPrenda {

	public PrendaLiquidacion(double base_price) {
		super();
		this.basePrice = base_price;
	}

	@Override
	double getValorPrenda() {
		return basePrice * 0.5d;
	}

}
