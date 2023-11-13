package teamManagement;
import java.util.*;

/**
 * 
 * @author Madison Phung
 *
 */
public class AthleticDepartment {
	private String school;
	/*
	private List<Coach> coaches;
	private List<Student> students;
	*/
	private double totalBudget;
	private double moneySpent;
	
	/**
	 * 
	 * @param school
	 * @param coaches
	 * @param students
	 * @param totalBudget
	 * @param moneySpent
	 */
	public AthleticDepartment(String school, double totalBudget, double moneySpent) {
		this.school = school;
		//this.coaches = coaches;
		//this.students = students;
		this.totalBudget = totalBudget;
		this.moneySpent = moneySpent;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSchool() {
		return school;
	}
	
	
	/**
	 * 
	 * @return
	 */
	/*
	public List<Coach> getCoaches(){
		// use other classes to compute this
		return coaches;
	}
	*/
	/**
	 * 
	 * @return
	 */
	/*
	public List<Student> students(){
		// use other classes to compute this
		return students;
	}
	*/
	/**
	 * 
	 * @return
	 */
	public double getTotalBudget() {
		// use other classes to compute this
		return totalBudget;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getMoneySpent() {
		// use other classes to compute this
		return moneySpent;
	}
}
