package de.tfr.thesis.vaadin.test.ditem.model;

import de.tfr.thesis.vaadin.test.ditem.model.PersonItem;
import de.tfr.thesis.vaadin.test.ditem.model.Quote;
import ditem.item.AbstractBeanItemBase;
import ditem.item.PropertyList;
import ditem.processor.DItem;
import ditem.property.DItemProperty;
import java.io.Serializable;
import javax.annotation.Generated;
import metamodel.MetaModelOf;

/**
 * <h1>Generated Class, Don't Change!</h1><br>For modifying open Quote.java <br>null
 */
@DItem
@MetaModelOf(value = "de.tfr.thesis.vaadin.test.ditem.model.Quote")
@Generated(value = "ditem.processor.DItem")
@SuppressWarnings("all")
public class QuoteItem extends AbstractBeanItemBase<Quote> implements Serializable {
  private DItemProperty<String> _nameProp;
  
  public DItemProperty<String> getNameProp() {
    return _nameProp;
  }
  
  private DItemProperty<Double> _priceProp;
  
  public DItemProperty<Double> getPriceProp() {
    return _priceProp;
  }
  
  private PropertyList<String> _dealerProp;
  
  public PropertyList<String> getDealerProp() {
    return _dealerProp;
  }
  
  private PersonItem _personProp;
  
  public PersonItem getPersonProp() {
    return _personProp;
  }
  
  public QuoteItem(final Quote bean) {
    super(bean);
    _nameProp = new DItemProperty<String>(String.class, bean::getName, bean::setName, "name");
    _priceProp = new DItemProperty<Double>(Double.class, bean::getPrice, bean::setPrice, "price");
    if(bean.getPerson() != null){
    	_personProp = new de.tfr.thesis.vaadin.test.ditem.model.PersonItem(bean.getPerson());
    }
    _dealerProp = new PropertyList(bean.getDealer());
    initBeanProperties(_nameProp, _priceProp);
  }
  
  private final static long serialVersionUID = 1L;
}
