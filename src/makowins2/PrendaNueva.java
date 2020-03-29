package makowins2;

public class PrendaNueva extends AbstractPrenda {

	public PrendaNueva(double base_price) {
		super();
		this.basePrice = base_price;
	}

	@Override
	double getValorPrenda() {
		return basePrice;
	}

}
