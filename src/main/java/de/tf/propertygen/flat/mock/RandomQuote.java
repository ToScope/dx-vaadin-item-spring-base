package de.tf.propertygen.flat.mock;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

import de.tf.propertygen.flat.model.Quote;

public class RandomQuote extends Quote implements Serializable {

	private static final long serialVersionUID = 1L;

	final static Random random = new Random();

	public RandomQuote() {
		super("Bestellung Nr. " + random.nextInt(10000));
		setTotalPrice(+random.nextInt(5000));
		setCreated(new Date());
	}
}
