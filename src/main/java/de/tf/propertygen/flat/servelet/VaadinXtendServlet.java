package de.tf.propertygen.flat.servelet;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import de.tfr.thesis.vaadin.base.VaadinXtendUI;

	@WebServlet(value ={"/VaadinXtend/*"}, asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = VaadinXtendUI.class)
public class VaadinXtendServlet extends VaadinServlet {
		private static final long serialVersionUID = 1L;
}
