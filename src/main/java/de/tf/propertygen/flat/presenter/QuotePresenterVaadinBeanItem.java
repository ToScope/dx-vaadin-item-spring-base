package de.tf.propertygen.flat.presenter;

import java.io.Serializable;

import com.vaadin.data.util.BeanItem;

import de.tf.propertygen.flat.mock.RandomQuote;
import de.tf.propertygen.flat.model.IQuote;
import de.tf.propertygen.flat.ui.QuoteUI;

public class QuotePresenterVaadinBeanItem extends AbstractQuotePresenter implements Serializable{

	private static final long serialVersionUID = 1L;


	public QuotePresenterVaadinBeanItem(QuoteUI ui, IQuote quote) {
		super(ui, quote);
		bindUIWithBeanItem();
		ui.getUpdateModel().addClickListener((e) -> {
			setRandomQuoteValuesOverItem();
			
//			setRandomQuoteValuesInModel(quote);
		});
	}

	public void bindUIWithBeanItem() {
		BeanItem<IQuote> qoteItem = new BeanItem<IQuote>(quote);
		ui.getTitle().setPropertyDataSource(qoteItem.getItemProperty("title"));
		ui.getCreated().setPropertyDataSource(qoteItem.getItemProperty("created"));
		ui.getTotalPrice().setPropertyDataSource(qoteItem.getItemProperty("totalPrice"));
		setInstantCommit();
	}
	
	/**
	 * Setzt zufällige Quote Werte direkt im Modell
	 * @param quote
	 */
	@SuppressWarnings("unused")
	private void setRandomQuoteValuesInModel(IQuote quote) {
		setRandomQuoteValues(quote);
		//Refresh nötig, da Model Zugriff nicht über Item
		markFormAsDirty();
	}


	/**
	 * Setzt zufällige Quote Werte �ber Item
	 * @param quote
	 */
	@SuppressWarnings("unchecked")
	private void setRandomQuoteValuesOverItem(){
		IQuote random = new RandomQuote();
		ui.getTitle().getPropertyDataSource().setValue(random.getTitle());
		ui.getTotalPrice().getPropertyDataSource().setValue(random.getTotalPrice());
		ui.getCreated().getPropertyDataSource().setValue(random.getCreated());
	}

}
