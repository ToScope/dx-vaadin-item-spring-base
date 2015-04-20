package de.tfr.thesis.vaadin.base

import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent
import com.vaadin.spring.annotation.SpringView
import com.vaadin.ui.Button
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.themes.ValoTheme
import javax.annotation.PostConstruct

@SpringView(name=LandingView.VIEW_NAME)
class LandingView extends VerticalLayout implements View {

	val public static String VIEW_NAME = ""
	val title = "This is the default view"

	@PostConstruct
	def void init() {
		addComponent(new Label(title))
		addComponent(newNavigationButton(VaadinXtendUI.VIEW_NAME))
		addComponent(newNavigationButton(DItemCollectionTestUI.VIEW_NAME))
		addComponent(newNavigationButton(DerivedPropertiesTestUI.VIEW_NAME))

	}

	override enter(ViewChangeEvent event) {
		UI.page.title = title
	}

	def Button newNavigationButton(String viewName) {
		return newNavigationButton(viewName, viewName)
	}

	private def Button newNavigationButton(String caption, String viewName) {
		val button = new Button(caption) => [
			addStyleName(ValoTheme.BUTTON_SMALL)
			addClickListener [
				UI => [
					navigator.navigateTo(viewName)
					page.title = caption
				]
			]
		]
		return button
	}
}