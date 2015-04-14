package de.tfr.thesis.vaadin.base;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.spring.annotation.SpringUI;
import de.tf.propertygen.flat.model.XBean;
import de.tf.propertygen.flat.model.XBeanItem;
import de.tf.propertygen.flat.presenter.xtend.QuotePresenterXtendBeanItem;
import de.tf.propertygen.flat.ui.AbstractStartUI;
import de.tf.propertygen.flat.ui.QuoteUI;

@Theme("valo")
@PreserveOnRefresh
@SpringUI(path = VaadinXtendUI.VIEW_NAME)
@SuppressWarnings("all")
public class VaadinXtendUI extends AbstractStartUI {
  public final static String VIEW_NAME = "vaadin-xtend-ui";
  
  @Override
  public void bind(final QuoteUI ui) {
    XBean bean = new XBean();
    XBeanItem item = new XBeanItem(bean);
    new QuotePresenterXtendBeanItem(ui, item);
  }
}
