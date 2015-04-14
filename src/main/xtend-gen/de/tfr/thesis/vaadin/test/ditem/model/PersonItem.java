package de.tfr.thesis.vaadin.test.ditem.model;

import de.tfr.thesis.vaadin.test.ditem.model.AddressItem;
import de.tfr.thesis.vaadin.test.ditem.model.Person;
import ditem.item.AbstractBeanItemBase;
import ditem.item.DItemPropertyList;
import ditem.processor.DItem;
import ditem.property.DItemProperty;
import ditem.property.DerivedProperty;
import java.io.Serializable;
import javax.annotation.Generated;
import metamodel.MetaModelOf;

/**
 * <h1>Generated Class, Don't Change!</h1><br>For modifying open Person.java <br>null
 */
@DItem
@MetaModelOf(value = "de.tfr.thesis.vaadin.test.ditem.model.Person")
@Generated(value = "ditem.processor.DItem")
@SuppressWarnings("all")
public class PersonItem extends AbstractBeanItemBase<Person> implements Serializable {
  private DItemProperty<String> _lastNameProp;
  
  public DItemProperty<String> getLastNameProp() {
    return _lastNameProp;
  }
  
  private DItemProperty<String> _firstNameProp;
  
  public DItemProperty<String> getFirstNameProp() {
    return _firstNameProp;
  }
  
  private DItemProperty<Integer> _yearProp;
  
  public DItemProperty<Integer> getYearProp() {
    return _yearProp;
  }
  
  private AddressItem _addressProp;
  
  public AddressItem getAddressProp() {
    return _addressProp;
  }
  
  private DItemPropertyList<AddressItem> _addressesProp;
  
  public DItemPropertyList<AddressItem> getAddressesProp() {
    return _addressesProp;
  }
  
  private DerivedProperty<String> _fullNameProp;
  
  public DerivedProperty<String> getFullNameProp() {
    return _fullNameProp;
  }
  
  public PersonItem(final Person bean) {
    super(bean);
    _lastNameProp = new DItemProperty<String>(String.class, bean::getLastName, bean::setLastName, "lastName");
    _firstNameProp = new DItemProperty<String>(String.class, bean::getFirstName, bean::setFirstName, "firstName");
    _yearProp = new DItemProperty<Integer>(Integer.class, bean::getYear, bean::setYear, "year");
    if(bean.getAddress() != null){
    	_addressProp = new de.tfr.thesis.vaadin.test.ditem.model.AddressItem(bean.getAddress());
    }
    _fullNameProp = new DerivedProperty(String.class, bean::fullName, "fullName", _lastNameProp, _firstNameProp);
    if(bean.getAddresses() != null){
    	java.util.List<AddressItem> _addressesPropList = bean.getAddresses().stream().map((p) -> new AddressItem(p)).collect(java.util.stream.Collectors.toList());
    	_addressesProp = new DItemPropertyList(_addressesPropList);
    }
    initBeanProperties(_lastNameProp, _firstNameProp, _yearProp);
  }
  
  private final static long serialVersionUID = 1L;
}
