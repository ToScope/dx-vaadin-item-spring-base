package de.tf.propertygen.flat.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Quote implements IQuote, Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date created;
	private double totalPrice;
	private String title;
	
	private Set<PropertyChangeListener> propertyChangeListeners = new HashSet<PropertyChangeListener>();

	public void add(PropertyChangeListener changeListener){
		propertyChangeListeners.add(changeListener);
	}
	
	protected void firePropertyChange(PropertyChangeEvent evt){
		for (PropertyChangeListener listener : propertyChangeListeners) {
			listener.propertyChange(evt);
		}
	}
	
	public Quote(String title) {
		this.title = title;
	}

	@Override
	public Date getCreated() {
		return created;
	}

	@Override
	public void setCreated(Date created) {
		firePropertyChange(new PropertyChangeEvent(this, "created", this.created, created));
		this.created = created;
	}

	@Override
	public double getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void setTotalPrice(double totalPrice) {
		firePropertyChange(new PropertyChangeEvent(this, "totalPrice", this.totalPrice, totalPrice));
		this.totalPrice = totalPrice;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		firePropertyChange(new PropertyChangeEvent(this, "title", this.title, title));
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quote other = (Quote) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Quote [created=" + created + ", totalPrice=" + totalPrice + ", title=" + title + ", propertyChangeListeners="
				+ propertyChangeListeners + "]";
	}

}
