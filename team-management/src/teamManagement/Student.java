package teamManagement;
import java.lang.IllegalArgumentException;

/**
 * This class represents a Student object.
 * 
 * The Student object stores the students id,
 * name, sport, year, and gender.
 * 
 * @author Madison Phung
 *
 */
public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String sport;
	private String year;
	private String gender;
	
	/**
	 * Constructs a new Student object with specified
	 * id, name, sport, year, and gender values.
	 * 
	 * @param id value for this Student object. It should
	 * only be a positive value.
	 * @param name value for this Student object.
	 * @param sport value for this Student object.
	 * @param year value for this Student object.
	 * @param gender value for this Student object.
	 * @throws IllegalArgumentException if the name, sport,
	 * gender, or year values are null or if the id is a
	 * negative value.
	 */
	public Student(int id, String name, String sport, String year, String gender) throws IllegalArgumentException {
		// if the name is null, throw an exception
		if(name == null) {
			throw new IllegalArgumentException ("Name cannot be null.");
		}
		
		// if the sport is null, throw an exception
		if (sport == null) {
			throw new IllegalArgumentException("Sport cannot be null.");
		}
		
		// if the gender is null, throw an exception
		if(gender == null) {
			throw new IllegalArgumentException("Gender cannot be null.");
		}
		
		// if the year is null, throw an exception
		if(year == null) {
			throw new IllegalArgumentException("Year cannot be null.");
		}
		
		// if the id is less than 0, throw an exception
		if (id < 0) {
			throw new IllegalArgumentException("Coach ID cannot be a negative number.");
		}
		
		this.id = id;
		this.name = name;
		this.sport = sport;
		this.year = year;
		this.gender = gender;
	}
	
	/**
	 * Return the id value representing this Student object.
	 * 
	 * @return the id of this Student object.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Return the name value representing this Student object.
	 * 
	 * @return the name of this Student object.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return the sport value representing this Student object.
	 * 
	 * @return the sport of this Student object.
	 */
	public String getSport() {
		return sport;
	}
	
	/**
	 * Return the year value representing this Student object.
	 * 
	 * @return the year of this Student object.
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * Return the gender value representing this Student object.
	 * 
	 * @return the gender of this Student object.
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Return the string representation of this Student object.
	 * 
	 * @return the string representation of this Student object.
	 */
	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Student ID: " + id + "\n" + "Year: " + year + "\n" + "Gender: " + gender + "\n" 
	+ "Sport: " + sport + "\n";
	}
	
	/**
	 * Compares this Student object with the specified Student
	 * object for ordering.
	 * 
	 * @param o the object to be compared
	 * @return a negative integer, zero, or positive integer if
	 * the lexicographical ordering for the specified object is 
	 * less than, equal to, or greater than this Student object.
	 */
	@Override
	public int compareTo(Student o) {
		// find the difference of the object's lexicographical ordering
		int compareNames = this.getName().compareTo(o.getName());
		
		return compareNames;
	}
	
	/**
	 * Indicates whether some object obj is "equal to" this one.
	 * Two Student objects are considered equal if their id's, 
	 * names, sports, years, and genders are the same.
	 * 
	 * @return true if the object is the same as the obj argument;
	 * It is false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		// return true if this object is the same as the given object
		if(this == obj) {
			return true;
		}
		
		// return false if the given object is null
		if(obj == null) {
			return false;
		}
		
		// return false if the given object is not an instance of Student
		if (!(obj instanceof Student)) {
			return false;
		}
		
		// create a Student object to compare with this object
		Student other = (Student) obj;
	
		
		// compare the names of the two objects
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		
		// compare the sports of the two objects
		if(sport == null) {
			if(other.sport != null) {
				return false;
			}
		}else if(!sport.equals(other.sport)) {
			return false;
		}
		
		// compare the years of the two objects
		if(year == null) {
			if(other.year != null) {
				return false;
			}
		}else if(!year.equals(other.year)) {
			return false;
		}	
		
		// compare the genders of the two objects
		if(gender == null) {
			if(other.gender != null) {
				return false;
			}
		}else if(!gender.equals(other.gender)) {
			return false;
		}	
		
		// compare the ID's of the two objects
		if(id < 0) {
			if(other.id != 0) {
				return false;
			}
		}else if(id != other.id) {
			return false;
		}
		
		
		return true;
	}
	
}
