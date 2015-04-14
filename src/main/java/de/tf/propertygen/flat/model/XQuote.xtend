package de.tf.propertygen.flat.model

import ditem.processor.DItem
import java.io.Serializable
import java.util.Date
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@DItem
class XQuote implements IQuote, Serializable {

	Date created;
	double totalPrice
	String title

	override void setTitle(String title) {
		this.title = title
		print("Set: " + title)
	}
}
