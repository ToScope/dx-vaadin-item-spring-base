package de.tfr.thesis.vaadin.base

import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent
import com.vaadin.spring.annotation.SpringView
import com.vaadin.ui.Button
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.themes.ValoTheme
import javax.annotation.PostConstruct

@SpringView(name = LandingView.VIEW_NAME)
class LandingView extends VerticalLayout implements View {
	  val public static String VIEW_NAME = ""
	  
	 @PostConstruct
    def void init() {
        addComponent(new Label("This is the default view"))
        addComponent(newNavigationButton(VaadinXtendUI.VIEW_NAME))
        addComponent(newNavigationButton(DItemCollectionTestUI.VIEW_NAME))
        addComponent(newNavigationButton(DerivedPropertiesTestUI.VIEW_NAME))
        
    }
	  
	override enter(ViewChangeEvent event) {
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