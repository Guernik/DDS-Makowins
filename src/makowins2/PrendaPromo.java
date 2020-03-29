package makowins2;

public class PrendaPromo extends AbstractPrenda {

	private double promoPrice;

	public PrendaPromo(double base_price, double promo_price) {
		super();
		this.basePrice = base_price;
		this.promoPrice = promo_price;
	}

	@Override
	double getValorPrenda() {
		return basePrice - promoPrice;
	}

}
