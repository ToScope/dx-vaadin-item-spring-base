package de.tfr.thesis.vaadin.test.ditem.model;

import de.tfr.thesis.vaadin.test.ditem.model.Address;
import ditem.item.DItemModel;
import ditem.processor.DItem;
import ditem.property.Derived;
import ditem.property.PropertyChangeEmitter;
import ditem.ref.FieldReference;
import ditem.ref.FieldType;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import metamodel.Deep;

@DItem
@Generated(value = "ditem.processor.DItem")
@SuppressWarnings("all")
public class Person implements DItemModel, Serializable, PropertyChangeEmitter {
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = String.class)
  public static final class _lastName implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = String.class)
  public static final class _firstName implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = int.class)
  public static final class _year implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = Address.class)
  public static final class _address implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = List.class)
  public static final class _addresses implements FieldReference {
  }
  
  private String lastName;
  
  private String firstName;
  
  private int year;
  
  @Deep
  private Address address;
  
  private List<Address> addresses;
  
  @Derived({ Person._lastName.class, Person._firstName.class })
  public String fullName() {
    return ((this.firstName + " ") + this.lastName);
  }
  
  public String getLastName() {
    return this.lastName;
  }
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public int getYear() {
    return this.year;
  }
  
  public Address getAddress() {
    return this.address;
  }
  
  public List<Address> getAddresses() {
    return this.addresses;
  }
  
  public void setLastName(final String lastName) {
    String _oldValue = this.lastName;
    this.lastName = lastName;
    _propertyChangeSupport.firePropertyChange("lastName", _oldValue, lastName);
  }
  
  public void setFirstName(final String firstName) {
    String _oldValue = this.firstName;
    this.firstName = firstName;
    _propertyChangeSupport.firePropertyChange("firstName", _oldValue, firstName);
  }
  
  public void setYear(final int year) {
    int _oldValue = this.year;
    this.year = year;
    _propertyChangeSupport.firePropertyChange("year", _oldValue, year);
  }
  
  public void setAddress(final Address address) {
    Address _oldValue = this.address;
    this.address = address;
    _propertyChangeSupport.firePropertyChange("address", _oldValue, address);
  }
  
  public void setAddresses(final List<Address> addresses) {
    List<Address> _oldValue = this.addresses;
    this.addresses = addresses;
    _propertyChangeSupport.firePropertyChange("addresses", _oldValue, addresses);
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
