package de.tfr.thesis.vaadin.base;

import com.vaadin.annotations.PreserveOnRefresh
import com.vaadin.annotations.Theme
import com.vaadin.spring.annotation.SpringView
import de.tf.propertygen.flat.model.XBean
import de.tf.propertygen.flat.model.XBeanItem
import de.tf.propertygen.flat.presenter.xtend.QuotePresenterXtendBeanItem
import de.tf.propertygen.flat.ui.AbstractStartUI
import de.tf.propertygen.flat.ui.QuoteUI

@Theme("valo")
@PreserveOnRefresh
@SpringView(name=VaadinXtendUI.VIEW_NAME)
public class VaadinXtendUI extends AbstractStartUI {

	public static val VIEW_NAME = "vaadin-xtend-ui";
	
	override void bind(QuoteUI ui) {
		var bean = new XBean()
		var item = new XBeanItem(bean)
		new QuotePresenterXtendBeanItem(ui, item)
	}

}