package de.tf.propertygen.flat.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("ditem_property_gen_base")
@SpringUI
public abstract class AbstractStartUI extends UI implements QuoteUI {

	private FieldGroup quote;
	private FormLayout form;
	private TextField totalPrice;
	private TextField title;
	private DateField created;
	private Button commit;
	private Button updateModel;

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);
		form = getForm();
		layout.addComponent(form);
		form.addComponent(getTitle());
		form.addComponent(getTotalPrice());
		form.addComponent(getCreated());

		commit = new Button("Commit");

		layout.addComponent(commit);

		updateModel = new Button("Update Model");
		layout.addComponent(updateModel);

		bind(this);
	}

	abstract protected void bind(QuoteUI ui);

	@Override
	public TextField getTotalPrice() {
		if (totalPrice == null) {
			totalPrice = new TextField("Price");
		}
		return totalPrice;
	}

	@Override
	public FormLayout getForm() {
		if (form == null) {
			form = new FormLayout();
			form.setCaption("Quote");
		}
		return form;
	}

	public FieldGroup getQuote() {
		if (quote == null) {
			quote = new FieldGroup();
		}
		return quote;
	}

	public TextField getTitle() {
		if (title == null) {
			title = new TextField("Title");
		}
		return title;
	}

	@Override
	public DateField getCreated() {
		if (created == null) {
			created = new DateField("Created");
		}
		return created;
	}

	public Button getCommit() {
		return commit;
	};

	public Button getUpdateModel() {
		return updateModel;
	}

}