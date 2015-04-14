package de.tf.propertygen.flat.model.finish;

import de.tf.propertygen.flat.model.IQuote;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class XQuote implements IQuote, Serializable {
  public final static long serialVersionUID = 1L;
  
  private Date created;
  
  private double totalPrice;
  
  private String title;
  
  private Set<PropertyChangeListener> propertyChangeListeners = new HashSet<PropertyChangeListener>();
  
  public void add(final PropertyChangeListener changeListener) {
    this.propertyChangeListeners.add(changeListener);
  }
  
  protected void firePropertyChange(final PropertyChangeEvent evt) {
    for (final PropertyChangeListener listener : this.propertyChangeListeners) {
      listener.propertyChange(evt);
    }
  }
  
  public XQuote(final String title) {
    this.title = title;
  }
  
  @Override
  public Date getCreated() {
    return this.created;
  }
  
  @Override
  public void setCreated(final Date created) {
    PropertyChangeEvent _propertyChangeEvent = new PropertyChangeEvent(this, "created", this.created, created);
    this.firePropertyChange(_propertyChangeEvent);
    this.created = created;
  }
  
  @Override
  public double getTotalPrice() {
    return this.totalPrice;
  }
  
  @Override
  public void setTotalPrice(final double totalPrice) {
    PropertyChangeEvent _propertyChangeEvent = new PropertyChangeEvent(this, "totalPrice", Double.valueOf(this.totalPrice), Double.valueOf(totalPrice));
    this.firePropertyChange(_propertyChangeEvent);
    this.totalPrice = totalPrice;
  }
  
  @Override
  public String getTitle() {
    return this.title;
  }
  
  @Override
  public void setTitle(final String title) {
    PropertyChangeEvent _propertyChangeEvent = new PropertyChangeEvent(this, "title", this.title, title);
    this.firePropertyChange(_propertyChangeEvent);
    this.title = title;
  }
}
