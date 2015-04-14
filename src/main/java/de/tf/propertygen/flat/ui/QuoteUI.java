package de.tf.propertygen.flat.ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public interface QuoteUI {

	public  TextField getTotalPrice();

	public  FormLayout getForm();

	public  TextField getTitle();

	public  DateField getCreated();
	
	public Button getCommit() ;
	
	public Button getUpdateModel();

}