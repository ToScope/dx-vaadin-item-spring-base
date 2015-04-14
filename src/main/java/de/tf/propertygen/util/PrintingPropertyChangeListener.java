package de.tf.propertygen.util;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;

public final class PrintingPropertyChangeListener implements PropertyChangeListener, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.printf ("Changed %s from %s to %s \n", evt.getPropertyName(), evt.getOldValue().toString(), evt.getNewValue());
	}
}