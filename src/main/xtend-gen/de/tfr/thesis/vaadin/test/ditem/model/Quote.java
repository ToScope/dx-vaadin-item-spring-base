package de.tfr.thesis.vaadin.test.ditem.model;

import de.tfr.thesis.vaadin.test.ditem.model.Person;
import ditem.item.DItemModel;
import ditem.processor.DItem;
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
public class Quote implements DItemModel, Serializable, PropertyChangeEmitter {
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = String.class)
  public static final class _name implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = double.class)
  public static final class _price implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = List.class)
  public static final class _dealer implements FieldReference {
  }
  
  /**
   * FieldReference for declaring DerivedProperties
   */
  @FieldType(value = Person.class)
  public static final class _person implements FieldReference {
  }
  
  private String name;
  
  private double price;
  
  private List<String> dealer;
  
  @Deep
  private Person person;
  
  public String getName() {
    return this.name;
  }
  
  public double getPrice() {
    return this.price;
  }
  
  public List<String> getDealer() {
    return this.dealer;
  }
  
  public Person getPerson() {
    return this.person;
  }
  
  public void setName(final String name) {
    String _oldValue = this.name;
    this.name = name;
    _propertyChangeSupport.firePropertyChange("name", _oldValue, name);
  }
  
  public void setPrice(final double price) {
    double _oldValue = this.price;
    this.price = price;
    _propertyChangeSupport.firePropertyChange("price", _oldValue, price);
  }
  
  public void setDealer(final List<String> dealer) {
    List<String> _oldValue = this.dealer;
    this.dealer = dealer;
    _propertyChangeSupport.firePropertyChange("dealer", _oldValue, dealer);
  }
  
  public void setPerson(final Person person) {
    Person _oldValue = this.person;
    this.person = person;
    _propertyChangeSupport.firePropertyChange("person", _oldValue, person);
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
