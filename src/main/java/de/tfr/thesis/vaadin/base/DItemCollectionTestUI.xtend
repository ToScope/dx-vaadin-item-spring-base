package de.tfr.thesis.vaadin.base

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.shared.ui.label.ContentMode
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Button
import com.vaadin.ui.CustomComponent
import com.vaadin.ui.FormLayout
import com.vaadin.ui.Label
import com.vaadin.ui.Table
import com.vaadin.ui.TextField
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import de.tfr.thesis.vaadin.test.ditem.model.Address
import de.tfr.thesis.vaadin.test.ditem.model.AddressItem
import de.tfr.thesis.vaadin.test.ditem.model.Person
import de.tfr.thesis.vaadin.test.ditem.model.Quote
import de.tfr.thesis.vaadin.test.ditem.model.QuoteItem

import static extension de.tfr.thesis.util.html.Tags.*
import static extension de.tfr.thesis.util.html.Units.*

@Theme("valo")
@SpringUI(path=DItemCollectionTestUI.VIEW_NAME)
class DItemCollectionTestUI extends UI {

	public static val VIEW_NAME = "ditem-collection-test";

	Table table

	override protected init(VaadinRequest request) {
		val root = new VerticalLayout()
		root.margin = true
		content = root

		root.addComponent(new Label("DItem Collection Test".h2, ContentMode.HTML))

		val form = new FormLayout()
		root.addComponent(form)

		val quote = newQuoteMock()
		var item = new QuoteItem(quote)

		table = new Table("Addresses Table", item.personProp.addressesProp)
		table.selectable = true
		table.immediate = true
		table.editable = true
		table.height = "200".px
		root.addComponent(table)

		item.personProp.addressesProp.forEach[#[cityProp, zipProp, streetProp].forEach[addValueChangeListener(e|println(e))]]

		val commit = new Button("commit")
		commit.addClickListener(e|table.commit())
		root.addComponent(commit)

		root.addComponent(new AddressForm(item.personProp.addressesProp.head))
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
			zip = 76131
		]
		val address2 = new Address() => [
			city = "Pforzheim"
			street = "Tunnelstraße"
			zip = 75172
		]
		val address3 = new Address() => [
			city = "Bretten"
			street = "Postweg"
			zip = 75015
		]
		quote.person = person
		quote.person.address = address1
		quote.person.addresses = #[address1, address2, address3]
		return quote
	}

	static class AddressForm extends CustomComponent {

		TextField street = new TextField("Street")
		TextField city = new TextField("City")
		TextField zip = new TextField("Zip")

		new(AddressItem item) {
			val layout = new FormLayout()
			setCompositionRoot(layout)
			#[street, city, zip].forEach [
				layout.addComponent(it)
				immediate = true
			]
			street.propertyDataSource = item.streetProp
			city.propertyDataSource = item.cityProp
			zip.propertyDataSource = item.zipProp

		}
	}

}