package de.tf.propertygen.oo.model;

public class Address {
	
	protected String city;
	protected String street;
	protected int postalCode;
	
	public Address() {
	}
	
	public Address(String street, int postalCode, String city) {
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
	

}
