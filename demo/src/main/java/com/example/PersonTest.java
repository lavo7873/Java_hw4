/**
 * 
 */
package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {
	public static void main(String[] args) {
		ArrayList<Person> givenList = new ArrayList<Person>();
		givenList.add(new Person("Joe", "Smith", 40));
		givenList.add(new Person("Amy", "Gold", 32));
		givenList.add(new Person("Tony", "Stork", 21));
		givenList.add(new Person("Sean", "Irish", 24));
		givenList.add(new Person("Tina", "Brock", 28));
		givenList.add(new Person("Lenny", "Hep", 18));

		Comparator<Person> sortedByAgeComparator = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		};

		Collections.sort(givenList, sortedByAgeComparator); // Ascending
		System.out.println("Sorted list by age - Ascending");
		for (int i = 0; i < givenList.size(); i++) {
			System.out.println(givenList.get(i));
		}
		System.out.println();
		Collections.sort(givenList, sortedByAgeComparator.reversed()); // Descending
		System.out.println("Sorted list by age - Descending");
		for (int i = 0; i < givenList.size(); i++) {
			System.out.println(givenList.get(i));
		}

		System.out.println();
		Comparator<Person> sortedByFirstNameComparator = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
			}
		};
		System.out.println("Sorted list based on first name - Ascending");
		Collections.sort(givenList, sortedByFirstNameComparator); // Ascending
		for (int i = 0; i < givenList.size(); i++) {
			System.out.println(givenList.get(i));
		}
		System.out.println();
		Collections.sort(givenList, sortedByFirstNameComparator.reversed()); // Descending
		System.out.println("Sorted list based on first name - Descending");
		for (int i = 0; i < givenList.size(); i++) {
			System.out.println(givenList.get(i));
		}

		System.out.println();
		Comparator<Person> sortedByLastNameLengthComparator = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getLastName().length() - p2.getLastName().length();
			}
		};
		System.out.println("Sorted list based on last name's length - Ascending");
		Collections.sort(givenList, sortedByLastNameLengthComparator); // Ascending
		for (int i = 0; i < givenList.size(); i++) {
			System.out.println(givenList.get(i));
		}
		System.out.println();
		System.out.println("Sorted list based on last name's length - Descending");
		Collections.sort(givenList, sortedByLastNameLengthComparator.reversed()); // Descending
		for (int i = 0; i < givenList.size(); i++) {
			System.out.println(givenList.get(i));
		}
	}
}