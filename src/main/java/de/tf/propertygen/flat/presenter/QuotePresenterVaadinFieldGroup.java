package de.tf.propertygen.flat.presenter;

import java.io.Serializable;
import java.util.Date;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.ui.Field;

import de.tf.propertygen.flat.mock.RandomQuote;
import de.tf.propertygen.flat.model.IQuote;
import de.tf.propertygen.flat.ui.QuoteUI;

public class QuotePresenterVaadinFieldGroup extends AbstractQuotePresenter implements Serializable{
	private static final long serialVersionUID = 1L;
	BeanFieldGroup<IQuote> fieldGroup = createFildGroup();
	
	public QuotePresenterVaadinFieldGroup(QuoteUI ui, IQuote quote) {
		super(ui, quote);
		 bindUIWithFildGroup();
		ui.getUpdateModel().addClickListener((e) -> {
			setRandomQuoteValuesOverFields();
		});
	}

	private void bindUIWithFildGroup() {
		fieldGroup.setItemDataSource(quote);
		fieldGroup.bind(ui.getTitle(), "title");
		fieldGroup.bind(ui.getCreated(), "created");
		fieldGroup.bind(ui.getTotalPrice(), "totalPrice");
	}
	
	
	@SuppressWarnings("unchecked")
	private void setRandomQuoteValuesOverFields(){
		IQuote random = new RandomQuote();
		((Field<String>) fieldGroup.getField("title")).setValue(random.getTitle());
		((Field<Date>) fieldGroup.getField("created")).setValue(random.getCreated());
		((Field<Double>) fieldGroup.getField("totalPrice")).setValue(random.getTotalPrice());
		
//		fieldGroup.getItemDataSource().getItemProperty("title").setValue(random.getTitle());
//		fieldGroup.getItemDataSource().getItemProperty("created").setValue(random.getCreated());
//		fieldGroup.getItemDataSource().getItemProperty("totalPrice").setValue(random.getTotalPrice());
		
//		fieldGroup.getField("title").getPropertyDataSource().setValue(random.getTitle());
//		fieldGroup.getField("created").getPropertyDataSource().setValue(random.getCreated());
//		fieldGroup.getField("totalPrice").getPropertyDataSource().setValue(random.getTotalPrice());
//		
	}

	private BeanFieldGroup<IQuote> createFildGroup() {
		BeanFieldGroup<IQuote> fieldGroup = new BeanFieldGroup<IQuote>(IQuote.class);
		ui.getCommit().addClickListener((e) -> commit(fieldGroup));
		return fieldGroup;
	}


}
