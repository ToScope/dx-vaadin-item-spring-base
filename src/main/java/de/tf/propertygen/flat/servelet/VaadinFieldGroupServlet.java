package de.tf.propertygen.flat.servelet;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import de.tf.propertygen.flat.ui.VaadinFieldGroupUI;

	@WebServlet(value ={"/VaadinFieldGroup/*"}, asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = VaadinFieldGroupUI.class)
public class VaadinFieldGroupServlet extends VaadinServlet {
		private static final long serialVersionUID = 1L;
}
