package de.tfr.thesis.vaadin.test.ditem.model;

import ditem.item.DItemModel;
import ditem.processor.DItem;
import ditem.property.PropertyChangeEmitter;
import ditem.ref.FieldReference;
import ditem.ref.FieldType;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.annotation.Generated;

@DItem
@Generated(value = "ditem.processor.DItem")
@SuppressWarnings("all")
public class Address implements DItemModel, Serializable, PropertyChangeEmitter {
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = String.class)
  public static final class _city implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = int.class)
  public static final class _zip implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = String.class)
  public static final class _street implements FieldReference {
  }
  
  private String city;
  
  private int zip;
  
  private String street;
  
  public String getCity() {
    return this.city;
  }
  
  public int getZip() {
    return this.zip;
  }
  
  public String getStreet() {
    return this.street;
  }
  
  public void setCity(final String city) {
    String _oldValue = this.city;
    this.city = city;
    _propertyChangeSupport.firePropertyChange("city", _oldValue, city);
  }
  
  public void setZip(final int zip) {
    int _oldValue = this.zip;
    this.zip = zip;
    _propertyChangeSupport.firePropertyChange("zip", _oldValue, zip);
  }
  
  public void setStreet(final String street) {
    String _oldValue = this.street;
    this.street = street;
    _propertyChangeSupport.firePropertyChange("street", _oldValue, street);
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
