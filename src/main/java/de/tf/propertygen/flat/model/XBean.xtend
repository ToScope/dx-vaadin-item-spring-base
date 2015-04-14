package de.tf.propertygen.flat.model

import java.util.Date
import org.eclipse.xtend.lib.annotations.Accessors
import ditem.processor.DItem

@DItem
@Accessors
class XBean implements IQuote{
	Date created;
	double totalPrice
	String title
}
