
package com.example;

public class Course {
	private String courseName;
	private String courseDescription;
	private String department;
	private String time;
	private String day;

	/**
	 * @param courseName        The course name
	 * @param courseDescription The course description
	 * @param department        The department that hosts the course
	 * @param time              The time of the course
	 * @param The               the course is held.
	 */
	Course(String courseName, String courseDescription, String department, String time, String day) {
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.time = time;
		this.day = day;
	}

	/**
	 * Sets the course name
	 * 
	 * @param courseName The name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * Sets the course description
	 * 
	 * @param courseDescription the description
	 */
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	/**
	 * Sets the department which hosts the course
	 * 
	 * @param department the department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Sets the time the course occurs
	 * 
	 * @param time the time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * Sets the day the course occurs
	 *  @param day the day 
	 */
	public void setDay(String day) {
		this.day = day;
	}

	// Getters
	/**
	 * Gets the course name
	 * 
	 * @return the name
	 */
	public String getCourseName() {
		return this.courseName;
	}

	/**
	 * Gets the course description
	 * 
	 * @return the course description
	 */
	public String getCourseDescription() {
		return this.courseDescription;
	}

	/**
	 * Gets the department
	 * 
	 * @return The department
	 */
	public String getDepartment() {
		return this.department;
	}

	/**
	 * Gets the time which the course occurs
	 * 
	 * @return The time
	 */
	public String getTime() {
		return this.time;
	}

	/**
	 * Gets the the course occurs
	 * 
	 * @return
	 */
	public String getDay() {
		return this.day;
	}

	
	public void printInfo() {
		System.out.println(this.courseName + " " + this.courseDescription + " " + this.department + " " + this.time
				+ "," + this.day);

	}

}
