package teamManagement;
import java.lang.IllegalArgumentException;
/**
 * This class represents a Team object.
 * 
 * The Team object stores the team's sport, 
 * total athletes, number of male athletes,
 * number of female athletes, and budget.
 * 
 * @author Madison Phung
 *
 */

public class Team implements Comparable<Team>{
	private String sport;
	private int totalAthletes;
	private int numOfMen;
	private int numOfWomen;
	private double budget;
	private Object team;
	
	/**
	 * Constructs a new team object with the specified
	 * sport, total athletes, number of men, number
	 * of women, and budget.
	 * 
	 * @param sport value for this Team object.
	 * @param totalAthletes value for this Team object. It should
	 * only be a positive value.
	 * @param numOfMen value for this Team object. It should only
	 * be a positive value.
	 * @param numOfWomen value for this Team object. It should only
	 * be a positive value.
	 * @param budget value for this Team object.
	 * @throws IllegalArgumentException if the sport value is null or
	 * if the totalAthletes, numOfMen, or numOfWomen values are negative.
	 * 
	 */
	public Team(String sport, int totalAthletes, int numOfMen, int numOfWomen, double budget) throws IllegalArgumentException {
		// if the sport value is null, throw an exception
		if(sport == null) {
			throw new IllegalArgumentException("Sport cannot be null.");
		}
		
		// if the totalAthletes value is negative, throw an exception
		if(totalAthletes < 0) {
			throw new IllegalArgumentException("Total athletes cannot be negative.");
		}
		
		// if the totalAthletes value is negative, throw an exception
		if(numOfMen < 0) {
			throw new IllegalArgumentException("Number of men cannot be negative.");
		}
		
		// if the totalAthletes value is negative, throw an exception
		if(numOfWomen < 0) {
			throw new IllegalArgumentException("Number of women cannot be negative.");
		}
		
		this.sport = sport;
		this.totalAthletes = totalAthletes;
		this.numOfMen = numOfMen;
		this.numOfWomen = numOfWomen;
		this.budget = budget;
	}
	
	/**
	 * Return the sport value representing this Team object.
	 * 
	 * @return the sport of this Team object.
	 */
	public String getSport() {
		return sport;
	}
	
	/**
	 * Return the total number of athletes of this Team object.
	 * 
	 * @return the total number of athletes of this Team object.
	 */
	public int totalAthletes() {
		// use other classes to compute this
		return totalAthletes;
	}
	
	/**
	 * Return the number of male athletes of this Team object.
	 * 
	 * @return the number of male athletes of this Team object.
	 */
	public int getNumOfMen() {
		return numOfMen;
	}
	
	/**
	 * Return the number of female athletes of this Team object.
	 * 
	 * @return the number of female athletes of this Team object.
	 */
	public int getNumOfWomen() {
		return numOfWomen;
	}
	
	/**
	 * Return the budget value representing this Team object.
	 *
	 * @return the budget of this Team object.
	 */
	public double getBudget() {
		return budget;
	}
	
	/**
	 * Returns the string representation of this Team object.
	 * 
	 * @return the string representation of this Team object.
	 * 
	 */
	@Override
	public String toString() {
		return "Team: " + sport + "\n" + "Total number of student-athletes: " + totalAthletes + "\n" + "Number of men: " 
	+ numOfMen + "\n" + "Number of women: " + numOfWomen + "\n" + "Team budget: " + budget;
	}
	
	/**
	 * Compares this Team object with the specified Team
	 * object for ordering.
	 * 
	 * @param o the object to be compared
	 * @return a negative integer, zero, or positive integer if
	 * the lexicographical ordering for the specified object is 
	 * less than, equal to, or greater than this Team object.
	 * 
	 */
	@Override
	public int compareTo(Team o) {
		// find the difference of the object's lexicographical ordering
		int compareNames = ((Team) this.team).compareTo(o);
		
		return compareNames;
	}
	
	
	/**
	 * Indicates whether some object obj is "equal to" this one.
	 * Two Team objects are considered equal if their sports,
	 * total athletes, number of men, number of women, and
	 * budgets are the same.
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
		
		// return false if the given object is not an instance of Team
		if (!(obj instanceof Team)) {
			return false;
		}
		
		// create a Team object to compare with this object
		Team other = (Team) obj;
	
		// compare the sports of the two objects
		if(sport == null) {
			if(other.sport != null) {
				return false;
			}
		}else if(!sport.equals(other.sport)) {
			return false;
		}
		
		// compare the totalAthletes of the two objects
		if(totalAthletes < 0) {
			if(other.totalAthletes != 0) {
				return false;
			}
		}else if(totalAthletes != other.totalAthletes) {
			return false;
		}
		
		// compare the numOfMen of the two objects
		if(numOfMen < 0) {
			if(other.numOfMen != 0) {
				return false;
			}
		}else if(numOfMen != other.numOfMen) {
			return false;
		}
		
		// compare the ID's of the two objects
		if(numOfWomen < 0) {
			if(other.numOfWomen != 0) {
				return false;
			}
		}else if(numOfWomen != other.numOfWomen) {
			return false;
		}
		
		// compare the salaries of the two objects
		if(budget < 0) {
			if(other.budget != 0) {
				return false;
			}
		}else if(budget != other.budget) {
			return false;
		}
		
		return true;
	}
}
