package Inheritance;

public class Location{
	private String country, district, county, parish, village;
	
	public Location() {
		
	}
	public Location(String country, String district, String county,String parish,String village) {
		this.country = country;
		this.district = district;
		this.county = county;
		this.parish = parish;
		this.village = village;
	}
	public String getCountry() {
		return country;
	}
	public String getDistrict() {
		return district;
	}
	public String getCounty() {
		return county;
	}
	public String getParish() {
		return parish;
	}
	public String getVillage() {
		return village;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public void setParish(String parish) {
		this.parish = parish;
	}
	public void setVillage(String village) {
		this.village = village;
	}
}
