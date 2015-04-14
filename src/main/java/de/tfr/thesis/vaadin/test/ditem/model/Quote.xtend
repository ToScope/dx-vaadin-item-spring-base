package de.tfr.thesis.vaadin.test.ditem.model

import ditem.processor.DItem
import metamodel.Deep
import java.util.List

@DItem
class Quote {
	String name
	double price
	List<String> dealer 
	@Deep
	Person person
}