package de.tfr.thesis.vaadin.test.ditem.model;

import de.tfr.thesis.vaadin.test.ditem.model.Address;
import ditem.item.AbstractBeanItemBase;
import ditem.processor.DItem;
import ditem.property.DItemProperty;
import java.io.Serializable;
import javax.annotation.Generated;
import metamodel.MetaModelOf;

/**
 * <h1>Generated Class, Don't Change!</h1><br>For modifying open Address.java <br>null
 */
@DItem
@MetaModelOf(value = "de.tfr.thesis.vaadin.test.ditem.model.Address")
@Generated(value = "ditem.processor.DItem")
@SuppressWarnings("all")
public class AddressItem extends AbstractBeanItemBase<Address> implements Serializable {
  private DItemProperty<String> _cityProp;
  
  public DItemProperty<String> getCityProp() {
    return _cityProp;
  }
  
  private DItemProperty<Integer> _zipProp;
  
  public DItemProperty<Integer> getZipProp() {
    return _zipProp;
  }
  
  private DItemProperty<String> _streetProp;
  
  public DItemProperty<String> getStreetProp() {
    return _streetProp;
  }
  
  public AddressItem(final Address bean) {
    super(bean);
    _cityProp = new DItemProperty<String>(String.class, bean::getCity, bean::setCity, "city");
    _zipProp = new DItemProperty<Integer>(Integer.class, bean::getZip, bean::setZip, "zip");
    _streetProp = new DItemProperty<String>(String.class, bean::getStreet, bean::setStreet, "street");
    initBeanProperties(_cityProp, _zipProp, _streetProp);
  }
  
  private final static long serialVersionUID = 1L;
}
