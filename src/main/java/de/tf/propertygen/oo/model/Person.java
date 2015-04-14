package de.tf.propertygen.oo.model;

public class Person {
	protected Gender gender;
	protected String firstName;
	protected String familyName;
	
	public Person(Gender gender, String familyName, String firstName) {
		this.gender = gender;
		this.familyName = familyName;
		this.firstName = firstName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	

}
