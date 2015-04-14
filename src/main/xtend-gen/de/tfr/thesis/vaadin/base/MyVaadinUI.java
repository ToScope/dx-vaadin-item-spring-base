package de.tfr.thesis.vaadin.base;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import de.tfr.thesis.vaadin.base.VaadinXtendUI;
import de.tfr.thesis.vaadin.base.config.Configs;

@SpringUI
@SuppressWarnings("all")
public class MyVaadinUI extends UI {
  @Override
  protected void init(final VaadinRequest vaadinRequest) {
    final VerticalLayout root = new VerticalLayout();
    Label _label = new Label("Vaadin UI tests:");
    root.addComponent(_label);
    ExternalResource _externalResource = new ExternalResource((Configs.LOCAL_HOST + VaadinXtendUI.VIEW_NAME));
    Link _link = new Link(VaadinXtendUI.VIEW_NAME, _externalResource);
    root.addComponent(_link);
    this.setContent(root);
  }
  
  public Button newNavigationButton(final String viewName) {
    return this.newNavigationButton(viewName, viewName);
  }
  
  private Button newNavigationButton(final String caption, final String viewName) {
    final Button button = new Button(caption);
    button.addStyleName(ValoTheme.BUTTON_SMALL);
    final Button.ClickListener _function = (Button.ClickEvent it) -> {
      UI _uI = this.getUI();
      Navigator _navigator = _uI.getNavigator();
      _navigator.navigateTo(viewName);
    };
    button.addClickListener(_function);
    return button;
  }
}
