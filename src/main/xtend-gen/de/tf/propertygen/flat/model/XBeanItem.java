package de.tf.propertygen.flat.model;

import de.tf.propertygen.flat.model.XBean;
import ditem.item.AbstractBeanItemBase;
import ditem.processor.DItem;
import ditem.property.DItemProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import metamodel.MetaModelOf;

/**
 * <h1>Generated Class, Don't Change!</h1><br>For modifying open XBean.java <br>null
 */
@DItem
@MetaModelOf(value = "de.tf.propertygen.flat.model.XBean")
@Generated(value = "ditem.processor.DItem")
@SuppressWarnings("all")
public class XBeanItem extends AbstractBeanItemBase<XBean> implements Serializable {
  private DItemProperty<Date> _createdProp;
  
  public DItemProperty<Date> getCreatedProp() {
    return _createdProp;
  }
  
  private DItemProperty<Double> _totalPriceProp;
  
  public DItemProperty<Double> getTotalPriceProp() {
    return _totalPriceProp;
  }
  
  private DItemProperty<String> _titleProp;
  
  public DItemProperty<String> getTitleProp() {
    return _titleProp;
  }
  
  public XBeanItem(final XBean bean) {
    super(bean);
    _createdProp = new DItemProperty<Date>(Date.class, bean::getCreated, bean::setCreated, "created");
    _totalPriceProp = new DItemProperty<Double>(Double.class, bean::getTotalPrice, bean::setTotalPrice, "totalPrice");
    _titleProp = new DItemProperty<String>(String.class, bean::getTitle, bean::setTitle, "title");
    initBeanProperties(_createdProp, _totalPriceProp, _titleProp);
  }
  
  private final static long serialVersionUID = 1L;
}
