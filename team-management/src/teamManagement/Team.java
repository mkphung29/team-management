package teamManagement;

/**
 * 
 * @author Madison Phung
 *
 */

public class Team {
	private String sport;
	private int totalAthletes;
	private int numOfMen;
	private int numOfWomen;
	private double budget;
	
	/**
	 * 
	 * @param sport
	 * @param totalAthletes
	 * @param numOfMen
	 * @param numOfWomen
	 * @param budget
	 */
	public Team(String sport, int totalAthletes, int numOfMen, int numOfWomen, double budget) {
		this.sport = sport;
		this.totalAthletes = totalAthletes;
		this.numOfMen = numOfMen;
		this.numOfWomen = numOfWomen;
		this.budget = budget;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSport() {
		return sport;
	}
	
	/**
	 * 
	 * @return
	 */
	public int totalAthletes() {
		// use other classes to compute this
		return totalAthletes;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumOfMen() {
		// use other classes to compute this
		return numOfMen;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumOfWomen() {
		// use other classes to compute this
		return numOfWomen;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getBudget() {
		// use other classes to compute this
		return budget;
	}
	
}
