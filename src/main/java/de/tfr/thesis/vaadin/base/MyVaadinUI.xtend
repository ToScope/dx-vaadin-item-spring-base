package de.tfr.thesis.vaadin.base

import com.vaadin.server.ExternalResource
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Button
import com.vaadin.ui.Label
import com.vaadin.ui.Link
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.themes.ValoTheme
import static de.tfr.thesis.vaadin.base.config.Configs.LOCAL_HOST
@SpringUI
public class MyVaadinUI extends UI {


	override protected void init(VaadinRequest vaadinRequest) {
		val root = new VerticalLayout()
		root.addComponent(new Label("Vaadin UI tests:"))
		root.addComponent(new Link(VaadinXtendUI.VIEW_NAME, new ExternalResource(LOCAL_HOST + VaadinXtendUI.VIEW_NAME)))
		setContent(root)
	}

	def Button newNavigationButton(String viewName) {
		return newNavigationButton(viewName, viewName)
	}

	private def Button newNavigationButton(String caption, String viewName) {
		val button = new Button(caption)
		button.addStyleName(ValoTheme.BUTTON_SMALL)
		button.addClickListener[getUI().navigator.navigateTo(viewName)]
		return button
	}
}