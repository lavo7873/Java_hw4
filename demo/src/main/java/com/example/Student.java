/**
 * 
 */
package com.example;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private String department;
    private int age;
    private double gpa;
    private LinkedList<Course> courses;
    
    //  Setters
    public void setDepartment(String department) { 
    	this.department = department;
    	}
    
    public void setAge(int age) {
    	this.age = age;
    	}
    
    public void setFirstName(String firstName) { 
    	this.firstName = firstName;
    	}

    public void setLastName(String lastName) { 
    	this.lastName = lastName;
    	}
    
    public void setMajor(String major) {
    	this.major = major;
    	}
    
    public void setGpa(double gpa) { 
    	this.gpa = gpa;
    	}
    
    public void setCourses(LinkedList<Course> courses) { 
    	this.courses = courses;
    	}

    //  Getters
    public String getDepartment() {
    	return department;
    	}
    
    public double getGpa() {
    	return gpa; 
    	}
    
    public String getFirstName() { 
    	return firstName;
    	}
    
    public String getLastName() { 
    	return lastName;
    	}
    
    public int getAge() { 
    	return age; 
    	}
    
    public LinkedList<Course> getCourses() { 
    	return courses; 
    	}
    
    public String getMajor() { 
    	return major; 
    	}

   
    //  Constructor
    Student(String firstName, String lastName, String major, String department, int age, double gpa, LinkedList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    //Sort courses based on selected attribute.
    public void sortCourses(boolean ascending, String courseAttribute){
        if (courseAttribute.equals("name")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course c1, Course c2) {
                        return c1.getCourseName().compareToIgnoreCase(c2.getCourseName());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("description")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course c1, Course c2) {
                        return c1.getCourseDescription().compareToIgnoreCase(c2.getCourseDescription());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("department")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course c1, Course c2) {
                        return c1.getDepartment().compareToIgnoreCase(c2.getDepartment());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("timeStart")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course c1, Course c2) {
                        return c1.getTime().compareToIgnoreCase(c2.getTime());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
        if (courseAttribute.equals("weekday")){
            if (ascending){
                Collections.sort(courses, new Comparator<Course>() {
                    public int compare(Course c1, Course c2) {
                        return c1.getDay().compareToIgnoreCase(c2.getDay());
                    }
                });
            }
            else{
                Collections.reverse(courses);
            }
        }
    }
}