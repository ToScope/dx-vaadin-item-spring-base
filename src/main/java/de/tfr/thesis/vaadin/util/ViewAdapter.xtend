package de.tfr.thesis.vaadin.util

import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent

interface ViewAdapter extends View{
	override void enter(ViewChangeEvent event){}	
}