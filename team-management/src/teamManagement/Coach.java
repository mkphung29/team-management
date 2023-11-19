package teamManagement;
import java.lang.IllegalArgumentException;

/**
 * This class represents a Coach object.
 * 
 * The Coach object stores the coach's id, name,
 * sport, salary, and if they coach the men's 
 * and/or women's team(s).  
 * 
 * @author Madison Phung
 *
 */

public class Coach implements Comparable<Coach>{
	private int id;
	private String name;
	private String sport;
	private String teamGender;
	private double salary;
	
	/**
	 * Constructs a new Coach object with specified
	 * id, name, sport, team gender, and salary.
	 * 
	 * @param id value for this coach object. It should
	 * only be a positive integer.
	 * @param name value for this coach object.
	 * @param sport value for this coach object.
	 * @param salary value for this coach object.
	 * @param teamGender value for this coach object.
	 * @throws IllegalArgumentException if constructor is
	 * called with an invalid id number.
	 */
	public Coach(int id, String name, String sport, String teamGender, double salary) throws IllegalArgumentException {
		// if the id is less than 0, throw an exception
		if (id < 0) {
			throw new IllegalArgumentException("Coach ID cannot be a negative number.");
		}
		
		this.id = id;
		this.name = name;
		this.sport = sport;
		this.teamGender = teamGender;
		this.salary = salary;
	}
	
	/**
	 * Return the id value representing this Coach object.
	 * 
	 * @return the id of this Coach object.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Return the name value representing this Coach object.
	 * 
	 * @return the name of this Coach object.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Return the sport value representing this Coach object.
	 * 
	 * @return the sport of this Coach object.
	 */
	public String getSport() {
		return sport;
	}
	
	/**
	 * Return the team gender value representing this Coach object.
	 * 
	 * @return the team gender of this Coach object.
	 */
	public String getTeamGender() {
		return teamGender;
	}
	
	/**
	 * Return the salary value representing this Coach object.
	 * 
	 * @return the salary of this Coach object.
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Return the string representation of this Coach object.
	 * 
	 * @returns the string representation of this Coach object.
	 */
	@Override
	public String toString() {
		return "Name: " + name + "\n" + "ID: " + id + "\n" + "Sport: " + sport + "\n" + "Salary: " + salary;
	}
	
	/**
	 * Compares this Coach object with the specified Coach
	 * object for ordering.
	 * 
	 * @param o the object to be compared
	 * @return a negative integer, zero, or positive integer if
	 * the salary for the specified object is less than, equal 
	 * to, or greater than this Coach object.
	 */
	@Override
	public int compareTo(Coach o) {
		// find the difference of the object's salaries to be compared
		int difference = (int) (o.salary - this.salary);
		
		return difference;
	}
	
	/**
	 * Indicates whether some object obj is "equal to" this one.
	 * Two Coach objects are considered equal if their names, sports,
	 * team genders, id's, and salaries are the same.
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
		
		// return false if the given object is not an instance of Coach
		if (!(obj instanceof Coach)) {
			return false;
		}
		
		// create a Coach object to compare with this object
		Coach other = (Coach) obj;
		
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
		
		// compare the sports of the two objects
		if(teamGender == null) {
			if(other.teamGender != null) {
				return false;
			}
		}else if(!teamGender.equals(other.teamGender)) {
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
		
		// compare the salaries of the two objects
		if(salary < 0) {
			if(other.salary != 0) {
				return false;
			}
		}else if(salary != other.salary) {
			return false;
		}
		
		return true;
	}
	
	
}
