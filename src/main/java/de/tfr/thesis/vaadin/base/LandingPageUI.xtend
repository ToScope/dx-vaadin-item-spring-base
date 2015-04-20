package de.tfr.thesis.vaadin.base

import com.vaadin.annotations.Theme
import com.vaadin.navigator.Navigator
import com.vaadin.server.ExternalResource
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.spring.navigator.SpringViewProvider
import com.vaadin.ui.Button
import com.vaadin.ui.Link
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import de.tfr.thesis.vaadin.util.AbstractViewChangeEvent
import org.springframework.beans.factory.annotation.Autowired

import static de.tfr.thesis.vaadin.base.config.Configs.LOCAL_HOST

@Theme("valo")
@SpringUI(path="")
public class LandingPageUI extends UI {

	@Autowired
	private SpringViewProvider viewProvider

	Button back

	override protected void init(VaadinRequest vaadinRequest) {
		val root = new VerticalLayout()
		val navigatorContent = new VerticalLayout()
		root.margin = true
		setContent(root)

		val navigator = new Navigator(this, navigatorContent)
		navigator.addProvider(viewProvider)

		back = new Button("< Back")

		back.addClickListener[navigator.navigateTo(LandingView.VIEW_NAME)]
		root.addComponent(back)

		root.addComponent(navigatorContent)

		navigator.addViewChangeListener(new AbstractViewChangeEvent() {
			override unblockedBeforeViewChange(ViewChangeEvent e) {
				back.visible = !(e.newView instanceof LandingView) 
			}
		})
	}

	def newLinkToView(String view) {
		new Link(view, new ExternalResource(LOCAL_HOST + view))
	}

	def getButtonBack() {
		back
	}

}