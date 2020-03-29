package makowins2;

import makowins.ETiposPrenda;

public abstract class AbstractPrenda {
	private ETiposPrenda tipoPrenda;

	protected double basePrice;

	abstract double getValorPrenda();

	public ETiposPrenda getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(ETiposPrenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

}
