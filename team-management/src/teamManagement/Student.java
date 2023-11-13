package teamManagement;
import java.util.*;

/**
 * 
 * @author Madison Phung
 *
 */
public class Student {
	private int id;
	private String name;
	private String sport;
	private String year;
	private String gender;
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param sport
	 * @param year
	 * @param gender
	 */
	public Student(int id, String name, String sport, String year, String gender) {
		this.id = id;
		this.name = name;
		this.sport = sport;
		this.year = year;
		this.gender = gender;
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
	public String getYear() {
		return year;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getGender() {
		return gender;
	}
	
	
	
}
