package teamManagement;

import java.util.*;

/**
 * TeamList class is used to store a collection
 * of Team objects. 
 * This class inherits all of its properties from 
 * an ArrayList<Team>.
 * 
 * It adds Team-specific functions that allows 
 * users to retrieve a list of all of the men's or 
 * women's sports teams.
 * 
 * @author Madison Phung
 *
 */
@SuppressWarnings("serial")
public class TeamList extends ArrayList<Team> {
	private TeamList mensTeams = null;
	private TeamList womensTeams = null;
	
	/**
	 * Retrieves a list of all of the men's sports teams.
	 * 
	 * @return a list of all of the men's sports teams.
	 * @throws NoSuchElementException if this team list is
	 * empty.
	 */
	public TeamList getMensTeams() throws NoSuchElementException{
		// if this teams list is empty,
		// throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of teams is empty.");
		}
		
		// add mens teams to new list
		for(Team t : this) {
			if(t.getNumOfMen() > 0) {
				mensTeams.add(t);
			}
		}
		
		return mensTeams;
	}
	
	/**
	 * Retrieves a list of all of the women's sports teams.
	 * 
	 * @return a list of all of the women's sports teams.
	 * @throws NoSuchElementException if this team list is
	 * empty.
	 */
	public TeamList getWomensTeams() throws NoSuchElementException{
		// if this team list is empty,
		// throw exception
		if(this.isEmpty()) {
			throw new NoSuchElementException("List of teams is empty.");
		}
		
		// add womens teams to new list
		for(Team t : this) {
			if(t.getNumOfWomen() > 0) {
				womensTeams.add(t);
			}
		}
		
		return womensTeams;
	}
}
