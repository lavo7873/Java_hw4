/**
 * 
 */

package com.example;

public class Person {

	private String firstName, lastName;
	private int age;

	public int getAge() {
		return age;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param firstName The first name
	 * @param lastName  The last name
	 * @param age       The age
	 */

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String toString() {
		return "Person{" + "First name: '" + firstName + '\'' + ", Last Name: '" + lastName + '\'' + ", Age: " + age
				+ '}';
	}
}