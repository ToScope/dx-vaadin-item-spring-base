package de.tf.propertygen.flat.mock;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import de.tf.propertygen.flat.model.Quote;

public class SampleQuote extends Quote implements Serializable{

	private static final long serialVersionUID = 1L;

	public SampleQuote() {
		super("Bestellung Server");
		setTotalPrice(2450);
		setCreated( getDummyDate());
	}

	private Date getDummyDate() {
		LocalDateTime ldt = LocalDateTime.of(2015, 02, 15, 16, 45);
		Instant instant = ldt.atZone(ZoneId.systemDefault()).toInstant();
		Date date = Date.from(instant);
		return date;
	}
	
	
	
	

}
