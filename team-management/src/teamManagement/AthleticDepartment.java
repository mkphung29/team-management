package teamManagement;
import java.util.*;

/**
 * This class represents an AthleticDepartment object.
 * 
 * The AthleticDepartment object stores the school, list
 * of coaches, list of students, list of teams, total 
 * budgets, and money spent.
 * 
 * It computes the money spent of all of the sports
 * in the department.
 * 
 * 
 * @author Madison Phung
 *
 */
public class AthleticDepartment {
	private String school;
	private List<Coach> coaches;
	private List<Student> students;
	private List<Team> teams;
	private double totalBudget;
	private double moneySpent;
	
	/**
	 * Constructs a new AthleticDepartment object with
	 * specified school, list of coaches, list of 
	 * students, list of teams, total budget, and
	 * money spent.
	 * 
	 * @param school value for this AthleticDepartment
	 * object. 
	 * @param coaches value for this AthleticDepartment
	 * object.
	 * @param students value for this AthleticDepartment
	 * object.
	 * @param teams value for this AthleticDepartment 
	 * object.
	 * @param moneySpent value for this AthleticDepartment
	 * object.
	 * 
	 */
	public AthleticDepartment(String school, List<Coach> coaches, List<Student> students, List<Team> teams) {
		this.school = school;
		this.coaches = coaches;
		this.students = students;
		this.teams = teams;
	}
	
	
	/**
	 * Return the school value representing this
	 * AthleticDepartment object.
	 * 
	 * @return the school of this AthleticDepartment
	 * object.
	 */
	public String getSchool() {
		return school;
	}
	
	
	/**
	 * Return the coaches list representing
	 * this AthleticDepartment object.
	 * 
	 * @return the coaches list of this 
	 * AthleticDepartment object.
	 */
	public List<Coach> getCoaches(){
		return coaches;
	}
	
	/**
	 * Returns the students list 
	 * representing this AthleticDepartment
	 * object.
	 * 
	 * @return the students list of this
	 * AthleticDepartment object
	 */
	
	public List<Student> students(){
		return students;
	}
	
	/**
	 * Returns the teams list representing
	 * this AthleticDepartment object.
	 * 
	 * @return the teams list of this 
	 * AthleticDepartment object.
	 */
	
	public List<Team> teams(){
		return teams;
	}
	
	/**
	 * Returns the totalBudget value
	 * representing this AthleticDepartment
	 * object.
	 * 
	 * @return the totalBudget of this
	 * AthleticDepartment object.
	 */
	public double getTotalBudget() {
		return totalBudget;
	}
	
	/**
	 * Sets the totalBudget value
	 * representing this AthleticDepartment
	 * object.
	 */
	public void setTotalBudget(double budget) {
		this.totalBudget = budget;
	}
	
	/**
	 * Computes the moneySpent value
	 * representing this AthleticDepartment
	 * object.
	 * 
	 * @return moneySpent by this 
	 * AthleticDepartment object.
	 */
	public double getMoneySpent() {
		moneySpent = totalBudget;
		
		for (Team t : teams) {
			moneySpent = moneySpent - t.getBudget();
		}

		for(Coach c : coaches){
			moneySpent = moneySpent - c.getSalary();
		}

		return moneySpent;
	}
}
