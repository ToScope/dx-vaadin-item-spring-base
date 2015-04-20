package de.tfr.thesis.vaadin.util

import com.vaadin.navigator.ViewChangeListener

class AbstractViewChangeEvent implements ViewChangeListener {

	override afterViewChange(ViewChangeEvent event) {
	}

	def void unblockedBeforeViewChange(ViewChangeEvent event) {
	}

	override beforeViewChange(ViewChangeEvent event) {
		unblockedBeforeViewChange(event)
		return true
	}

}