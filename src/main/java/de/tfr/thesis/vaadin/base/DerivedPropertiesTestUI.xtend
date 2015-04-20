package de.tfr.thesis.vaadin.base

import com.vaadin.annotations.Theme
import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent
import com.vaadin.shared.ui.label.ContentMode
import com.vaadin.spring.annotation.SpringView
import com.vaadin.ui.FormLayout
import com.vaadin.ui.Label
import com.vaadin.ui.TextField
import com.vaadin.ui.VerticalLayout
import de.tfr.thesis.vaadin.test.ditem.model.Address
import de.tfr.thesis.vaadin.test.ditem.model.Person
import de.tfr.thesis.vaadin.test.ditem.model.Quote
import de.tfr.thesis.vaadin.test.ditem.model.QuoteItem
import javax.annotation.PostConstruct

import static extension de.tfr.thesis.util.html.Tags.*

@Theme("valo")
@SpringView(name=DerivedPropertiesTestUI.VIEW_NAME)
class DerivedPropertiesTestUI extends VerticalLayout implements View {

	public static val VIEW_NAME = "derived-properties-test";

	TextField firstName
	TextField lastName
	Label fullName

	@PostConstruct
	def init() {
		margin = true

		addComponent(new Label("Derived Properties Test".h2, ContentMode.HTML))

		val form = new FormLayout()
		addComponent(form)

		firstName = new TextField("Firstname")
		lastName = new TextField("Lastname")
		fullName = new Label("Full Name")

		#[firstName, lastName, fullName].forEach[form.addComponent(it)]
		#[firstName, lastName].forEach[immediate = true]

		val quote = newQuoteMock()
		var item = new QuoteItem(quote)

		firstName.propertyDataSource = item.personProp.firstNameProp
		lastName.propertyDataSource = item.personProp.lastNameProp
		fullName.propertyDataSource = item.personProp.fullNameProp

		item.personProp.fullNameProp.addValueChangeListener[println(it.property)]
		item.personProp.firstNameProp.addValueChangeListener[println(it.property)]

	}

	def static newQuoteMock() {
		val quote = new Quote() => [
			name = "Quote Hard Drive"
			price = 42
			dealer = #["naumann", "talksky", "intertech"]
		]
		val person = new Person() => [
			year = 1988
			firstName = "Max"
			lastName = "Mustermann"
		]
		val address1 = new Address() => [
			city = "Karlsruhe"
			street = "Kaiserstr"
			zip = 1234
		]
		val address2 = new Address() => [
			city = "Karlsruhe"
			street = "Kaiserstr"
			zip = 1234
		]
		quote.person = person
		quote.person.address = address1
		quote.person.addresses = #[address1, address2]
		return quote
	}
	
	override enter(ViewChangeEvent event) {
	}

}