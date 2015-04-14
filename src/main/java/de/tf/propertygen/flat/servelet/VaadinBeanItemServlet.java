package de.tf.propertygen.flat.servelet;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import de.tf.propertygen.flat.ui.VaadinBeanItemUI;

	@WebServlet(value ={"/VaadinBeanItem/*","/VAADIN/*"}, asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = VaadinBeanItemUI.class)
public class VaadinBeanItemServlet extends VaadinServlet {
		private static final long serialVersionUID = 1L;
}
