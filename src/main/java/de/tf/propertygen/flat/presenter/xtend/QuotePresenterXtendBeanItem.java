package de.tf.propertygen.flat.presenter.xtend;

import de.tf.propertygen.flat.mock.RandomQuote;
import de.tf.propertygen.flat.model.IQuote;
import de.tf.propertygen.flat.model.XBeanItem;
import de.tf.propertygen.flat.presenter.AbstractQuotePresenter;
import de.tf.propertygen.flat.ui.QuoteUI;

public class QuotePresenterXtendBeanItem extends AbstractQuotePresenter {
	private static final long serialVersionUID = 1L;
	final XBeanItem xqoute;
	
	public QuotePresenterXtendBeanItem(QuoteUI ui, XBeanItem xqoute) {
		super(ui, xqoute.getBean());
		this.xqoute = xqoute;
		bindUIWithBeanItem();
		ui.getUpdateModel().addClickListener((e) -> {
			setRandomQuoteValuesWithXProperty();
		});
	}

	public void bindUIWithBeanItem() {
		ui.getTitle().setPropertyDataSource(xqoute.getTitleProp());
		ui.getCreated().setPropertyDataSource(xqoute.getCreatedProp());
		ui.getTotalPrice().setPropertyDataSource(xqoute.getTotalPriceProp());
		setInstantCommit();
	}
	
	/**
	 * Setzt zufällige Quote Werte auf Item
	 */
	private void setRandomQuoteValuesWithXProperty(){
		IQuote random = new RandomQuote();
		xqoute.getTitleProp().setValue(random.getTitle());
		xqoute.getTotalPriceProp().setValue(random.getTotalPrice());
		xqoute.getCreatedProp().setValue(random.getCreated());
	}
	
	/**
	 * Setzt zufällige Quote Werte auf Item
	 * Typunsichere Variante mit tPropertyDataSource
	 */
	@SuppressWarnings({ "unused", "unchecked" })
	private void setRandomQuoteValuesWithPropertyDataSource(){
		IQuote random = new RandomQuote();
		ui.getTitle().getPropertyDataSource().setValue(random.getTitle());
		ui.getTotalPrice().getPropertyDataSource().setValue(random.getTotalPrice());
		ui.getCreated().getPropertyDataSource().setValue(random.getCreated());
	}

}
