package teamManagement;

import java.util.*;

/**
 * StudentList class is used to store a collection
 * of Student objects. 
 * This class inherits all of its properties from 
 * an ArrayList<Student>.
 * 
 * It adds Student-specific functions that allows 
 * users to retrieve a list of all student 
 * athletes from a specific sport, retrieve a 
 * list of all student athletes from a specific
 * year, and retrieve a list of all student
 * athletes for a specific gender.
 * 
 * @author Madison Phung
 *
 */
@SuppressWarnings("serial")
public class StudentList extends ArrayList<Student>{
	private StudentList currentList = null;
	
	/**
	 * Retrieves a list of all students from a specified sport.
	 * 
	 * @return a list of all students from a specified sport.
	 * @throws NoSuchElementException if this student list is empty.
	 * @throws IllegalArgumentException if the function is called with an invalid
	 * sport value
	 * @throws NullPointerException if the function is called with a null value.
	 */
	public StudentList getAllSport(String sport) throws IllegalArgumentException, NullPointerException, NoSuchElementException {
		// if this students list is empty
		// throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of students is empty.");
		}
		
		// if the sport value is null
		// throw exception
		if(sport == null) {
			throw new NullPointerException("Sport cannot be null.");
		}
		
		// add students from specified sport
		// to new list
		for (Student s : this) {
			if(s.getSport() == sport) {
				currentList.add(s);
			}
		}
		
		return currentList;
	}
	
	/**
	 * Retrieves a list of all students from a specified year.
	 * 
	 * @return a list of all students from a specified year.
	 * @throws IllegalArgumentExceptionif the specified year is not a Freshman,
	 * Sophomore, Junior, or Senior.
	 * @throws NullPointerException if the function is called with a null value.
	 * @throws NoSuchElementException if this student list is empty.
	 */
	public StudentList getAllYear(String year) throws IllegalArgumentException, NullPointerException, NoSuchElementException {
		// if the year value is invalid
		// throw exception
		if(year != "Freshman" || year != "Sophomore" || year != "Junior" || year != "Senior") {
			throw new IllegalArgumentException("That class does not exist.");
		}
		
		// if the year value is null
		// throw exception
		if(year == null) {
			throw new NullPointerException("Year cannot be null.");
		}
		
		// if this student list is empty
		// throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of students is empty.");
		}
		
		// add students from specified year
		// to new list
		for(Student s : this) {
			if(s.getYear() == year) {
				currentList.add(s);
			}
		}
		return currentList;
	}
	
	/**
	 * Retrieves a list of all students from a specified gender.
	 * 
	 * @return a list of all students that are either in a male sport
	 * or female sport.
	 * @throws IllegalArgumentException if the function is called with an invalid
	 * gender.
	 * @throws NoSuchElementException if this student list is empty.
	 * @throws NullPointerException if the function is called with a null value.
	 */
	public StudentList getAllGender(String gender)throws IllegalArgumentException, NullPointerException {
		// if the gender value is invalid
		// throw exception
		if(gender != "Male" || gender != "Female") {
			throw new IllegalArgumentException("Invalid gender.");
		}
		
		// if this student list is empty
		// throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of students is empty.");
		}
		
		// if the gender value is null
		// throw exception
		if(gender == null) {
			throw new NullPointerException("Gender cannot be null.");
		}
		
		// add students from specified team
		// gender to new list
		for(Student s : this) {
			if(s.getGender() == gender) {
				currentList.add(s);
			}
		}
		
		return currentList;
	}
}
