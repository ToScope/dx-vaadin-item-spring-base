package de.tf.propertygen.oo.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Quote {
	private Date created;
	private double totalPrice;
	private String title;
	private List<String> items = new LinkedList<String>();
	private Person person;
	private Address address;

	public Quote(String title) {
		this.title = title;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getItems() {
		return items;
	}

	public void addItem(String item) {
		items.add(item);
	}

	public int size() {
		return items.size();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
