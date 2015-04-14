package de.tf.propertygen.flat.ui;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.spring.annotation.SpringUI;

import de.tf.propertygen.flat.mock.SampleQuote;
import de.tf.propertygen.flat.model.Quote;
import de.tf.propertygen.flat.presenter.QuotePresenterVaadinBeanItem;
import de.tf.propertygen.util.PrintingPropertyChangeListener;

@Theme("ditem_property_gen_base")
@PreserveOnRefresh
@SpringUI
public class VaadinBeanItemUI extends AbstractStartUI {
	private static final long serialVersionUID = 1L;

	@Override
	protected
	void bind(QuoteUI ui) {
		Quote quoteModel = new SampleQuote();
		quoteModel.add( new PrintingPropertyChangeListener());
		new QuotePresenterVaadinBeanItem(ui, quoteModel);
	}


}