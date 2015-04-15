package de.tfr.thesis.vaadin.base

import com.vaadin.annotations.PreserveOnRefresh
import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.FormLayout
import com.vaadin.ui.Label
import com.vaadin.ui.TextField
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import de.tfr.thesis.vaadin.test.ditem.model.Address
import de.tfr.thesis.vaadin.test.ditem.model.Person
import de.tfr.thesis.vaadin.test.ditem.model.Quote
import de.tfr.thesis.vaadin.test.ditem.model.QuoteItem

@Theme("valo")
@PreserveOnRefresh
@SpringUI(path=DerivedPropertiesTestUI.VIEW_NAME)
class DerivedPropertiesTestUI extends UI{
	
	public static val VIEW_NAME = "derived-properties-test";
	
	TextField firstName
	TextField lastName
	Label fullName
		
	override protected init(VaadinRequest request) {
		val root = new VerticalLayout()
		content = root
		
		root.addComponent(new Label("Derived Properties test"))
		
		val form = new FormLayout()
		root.addComponent(form)
		
		firstName = new TextField("Firstname")
		lastName = new TextField("Lastname")
		fullName = new Label("Full Name")
		
		#[firstName,lastName, fullName].forEach[form.addComponent(it)]
		#[firstName,lastName].forEach[immediate = true]
		
		
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
	
	
}