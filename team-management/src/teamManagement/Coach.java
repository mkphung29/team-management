package teamManagement;
import java.util.*;

/**
 * 
 * @author Madison Phung
 *
 */
public class Coach {
	private int id;
	private String name;
	private String sport;
	private double salary;
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param sport
	 * @param salary
	 */
	public Coach(int id, String name, String sport, double salary) {
		this.id = id;
		this.name = name;
		this.sport = sport;
		this.salary = salary;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
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
	public double getSalary() {
		return salary;
	}
}
