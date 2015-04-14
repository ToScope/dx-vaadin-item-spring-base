package de.tf.propertygen.flat.model;

import de.tf.propertygen.flat.model.IQuote;
import ditem.item.DItemModel;
import ditem.processor.DItem;
import ditem.property.PropertyChangeEmitter;
import ditem.ref.FieldReference;
import ditem.ref.FieldType;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@DItem
@Generated(value = "ditem.processor.DItem")
@SuppressWarnings("all")
public class XQuote implements DItemModel, Serializable, PropertyChangeEmitter, IQuote {
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = Date.class)
  public static final class _created implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = double.class)
  public static final class _totalPrice implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = String.class)
  public static final class _title implements FieldReference {
  }
  
  private Date created;
  
  private double totalPrice;
  
  private String title;
  
  @Override
  public void setTitle(final String title) {
    this.title = title;
    InputOutput.<String>print(("Set: " + title));
  }
  
  @Pure
  public Date getCreated() {
    return this.created;
  }
  
  public void setCreated(final Date created) {
    this.created = created;
  }
  
  @Pure
  public double getTotalPrice() {
    return this.totalPrice;
  }
  
  public void setTotalPrice(final double totalPrice) {
    this.totalPrice = totalPrice;
  }
  
  @Pure
  public String getTitle() {
    return this.title;
  }
  
  private PropertyChangeSupport _propertyChangeSupport = new PropertyChangeSupport(this);
  
  public void addPropertyChangeListener(final PropertyChangeListener listener) {
    this._propertyChangeSupport.addPropertyChangeListener(listener);
  }
  
  public void removePropertyChangeListener(final PropertyChangeListener listener) {
    this._propertyChangeSupport.removePropertyChangeListener(listener);
  }
  
  private final static long serialVersionUID = 1L;
}
