package Inheritance;

import java.util.ArrayList;

public class Child extends Parent{
	private String name, nationality;
	private int yob;
	private ArrayList<Location> locations;
	
	public Child() {
	
	}
	public Child(String name, String nationality,int yob, Location location) {
		this.name = name;
		this.nationality = nationality;
		this.yob = yob;
		this.addLocation(location);
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
	public void setName(String name) {
		this.name = name;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
}
