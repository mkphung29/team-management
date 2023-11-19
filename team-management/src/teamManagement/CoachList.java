package teamManagement;

import java.util.*;

/**
 * CoachList class is used to store a collection
 * of Coach objects. 
 * This class inherits all of its properties from 
 * an ArrayList<Coach>.
 * 
 * It adds Coach-specific functions that allows 
 * users to search for the highest paid coach,
 * the lowest paid coach, retrieve a list of all coaches
 * for a specific sport,and retrieve a list of all men's \
 * and/or women's coaches.
 * 
 * @author Madison Phung
 *
 */
@SuppressWarnings("serial")
public class CoachList extends ArrayList<Coach>{
	private Coach currentCoach = null;
	private CoachList currentList = null;
	
	/**
	 * Retrieves the highest paid coach.
	 *
	 * @return the highest paid coach. Since the array list is already sorted,
	 * the highest paid coach is the first element of the CoachList.
	 * @throws NoSuchElementException if this coach list is empty.
	 */
	public Coach getHighestPaid() throws NoSuchElementException {
		// if this list is empty, throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of coaches is empty.");
		}
		
		// get the first element of this list
		currentCoach = this.get(0);
		
		return currentCoach;
	}
	
	
	/**
	 * Retrieves the lowest paid coach.
	 * 
	 * @return the lowest paid coach. Since the array list is already sorted,
	 * the lowest paid coach is the last element of the CoachList.
	 * @throws NoSuchElementException if this coach list is empty.
	 */
	public Coach getLowestPaid() throws NoSuchElementException{
		// if this list is empty, throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of coaches is empty.");
		}
		
		// get the last element of this list
		currentCoach = this.get(this.size() - 1);
		
		return currentCoach;
	}
	
	
	/**
	 * Retrieves a list of coaches for a specific sport. 
	 * 
	 * @param sport to specify for the coach list.
	 * @return a list of coaches for the specified sport.
	 * @throws NoSuchElementException if this coach list is 
	 * empty.
	 * @throws NullPointerException if the function is called with
	 * a null value.
	 */
	public CoachList getAllTeam(String sport) throws NoSuchElementException, NullPointerException{
		// if this list is empty, throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of coaches is empty.");
		}
		
		// if the sport value is null, throw
		// exception
		if(sport == null) {
			throw new NullPointerException("Sport cannot be null.");
		}
		
		// add coaches with specified sport to 
		// new list
		for(Coach c : this) {
			if(c.getSport() == sport) {
				currentList.add(c);
			}
		}
		
		return currentList;
	}
	
	/**
	 * Retrieves a list of coaches for a specific gender of
	 * a team.
	 * 
	 * @param teamGender to specify for the coach list.
	 * @return a list of coaches for the specified gender.
	 * @throws NoSuchElementException if this coach list is
	 * empty.
	 * @throws NullPointerException if the function is called with
	 * a null value.
	 */
	public CoachList getAllGender(String teamGender) throws NoSuchElementException, NullPointerException{
		// if this list is empty, throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of coaches is empty.");
		}
		
		// if the teamGender value is null, 
		// throw exception
		if(teamGender == null) {
			throw new NullPointerException("Team gender cannot be null.");
		}
		
		// add coaches with specified gender to
		// new list
		for(Coach c : this) {
			if(c.getTeamGender() == teamGender || c.getTeamGender() == "Both") {
				currentList.add(c);
			}
		}
		
		return currentList;
	}
}
