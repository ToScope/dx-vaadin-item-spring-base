package de.tf.propertygen.flat.presenter;

import java.io.Serializable;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;

import de.tf.propertygen.flat.mock.RandomQuote;
import de.tf.propertygen.flat.model.IQuote;
import de.tf.propertygen.flat.ui.QuoteUI;

public abstract class AbstractQuotePresenter implements Serializable{

	private static final long serialVersionUID = 1L;
	protected final QuoteUI ui;
	protected final IQuote quote;

	protected static void setRandomQuoteValues(IQuote quote) {
		IQuote random = new RandomQuote();
		quote.setTitle(random.getTitle());
		quote.setTotalPrice(random.getTotalPrice());
		quote.setCreated(random.getCreated());
	}
	
	public AbstractQuotePresenter(QuoteUI ui){
		this(ui,null);
	}

	public AbstractQuotePresenter(QuoteUI ui, IQuote quote) {
		this.ui = ui;
		this.quote = quote;
	}

	protected static void commit(final BeanFieldGroup<?> group) {
		try {
			group.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}

	protected void markFormAsDirty() {
		ui.getTitle().markAsDirty();
		ui.getCreated().markAsDirty();
		ui.getTotalPrice().markAsDirty();
	}
	
	protected void setInstantCommit() {
		ui.getCreated().setImmediate(true);
		ui.getTitle().setImmediate(true);
		ui.getTotalPrice().setImmediate(true);
	}


}