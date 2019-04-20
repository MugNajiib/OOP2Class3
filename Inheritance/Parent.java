package Inheritance;

import java.util.ArrayList;
import java.util.Calendar;

public class Parent {
	private String name, nationality;
	private int yob;
	private ArrayList<Location> locations = new ArrayList<Location>();
	private ArrayList<Child> children = new ArrayList<Child>();
	
	public Parent() {
		
	}
	public Parent(String name, String nationality, int yob, Location location, Child child) {
		this.name = name;
		this.nationality = nationality;
		this.yob = yob;
		addLocation(location);
		this.children = children;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public void addLocation(Location location) {
		this.locations.add(location);
	}
	public void addChildren(Child  child) {
		this.children.add(child);
	}
	public String getName() {
		return name;
	}
	public String getNationality() {
		return nationality;
	}
	public int getYob() {
		return yob;
	}
	public ArrayList<Location> getLocations() {
		return locations;
	}
	public ArrayList<Child> getChildren() {
		return children;
	}
	public int getAge() {
		int current_year = Calendar.getInstance().get(Calendar.YEAR);
		return  current_year - this.yob ;
	}
	public int getNumberOfChildren() {
		return this.children.size();
	}
	
}
