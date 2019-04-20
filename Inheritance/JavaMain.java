package Inheritance;

import java.util.ArrayList;

public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Parent();
		p1.setName("Mugalaasi Najiib");
		p1.setYob(1988);
		p1.setNationality("Uganda");
		
		Parent p2 = new Parent();
		p2.setName("Muhammadi Salah");
		p2.setYob(1984);
		p2.setNationality("Nigeria");
		
		ArrayList<Parent> parents = new ArrayList<Parent>();
		parents.add(p1);
		parents.add(p2);
		
		Location loc1 = new Location("Uganda","Kampala","Rubaga","Wakaliga","Wakanda");
		Location loc2 = new Location("Rwanda","Kigali","Nyenda","Kabalagala","Mlai");
		Location loc3 = new Location("kenya","Nairobi","Baga","Galinga","Tema");
		Location loc4 = new Location("Tanzania","Kigoma","Tanla","Kutia","Wonda");
		Location loc5 = new Location("Nigeria","Lagos","Abujja","Kano","Puchu");
		Location loc6 = new Location("Congo","Kawuma","Gomma","Butembo","Lukaku");
		
		parents.get(0).addLocation(loc1);
		parents.get(0).addLocation(loc2);
		
		parents.get(1).addLocation(loc4);
		parents.get(1).addLocation(loc1);
				
		Child ch1 = new Child("Carol","Uganda",1999,loc1);
		Child ch2 = new Child("Pius","Kenya",1993,loc3);
		Child ch3 = new Child("Recheal","Rwanda",1994,loc2);
		Child ch4 = new Child("Martin","Congo",1997,loc6);
		Child ch5 = new Child("Bilal","Nigeria",1992,loc5);
		Child ch6 = new Child("John","Tanzania",1995,loc4);
		
		ArrayList<Child> Chld = new ArrayList<Child>();
		Chld.add(ch1);
		Chld.add(ch2);
		Chld.add(ch3);
		Chld.add(ch4);
		Chld.add(ch5);
		Chld.add(ch6);
		
		p1.addChildren(ch1);
		p1.addChildren(ch2);
		p1.addChildren(ch5);
		
		p2.addChildren(ch1);
		p2.addChildren(ch6);
		p2.addChildren(ch4);
		
		System.out.println("PROGRAM OUTPUT  FOR PARENTS\n....................\n");
		
		for(int n= 0; n<parents.size(); n++) {
			System.out.println("Parent " +(n+1)+"\n....................\n");
			System.out.println("Parent \n....................\n");
			System.out.println("\tName: "+parents.get(n).getName());
			System.out.println("\tNationality: "+parents.get(n).getNationality());
			System.out.println("\tYear Of Birth: "+parents.get(n).getYob());
			System.out.println("\tYear Of Birth: "+parents.get(n).getAge());
			
			System.out.println("\t\tLoction Details \n\t\t....................");
			
			for (int i=0;i<parents.get(n).getLocations().size();i++) {
				System.out.println("\t\tLocation: "+(i+1));
				System.out.println("\t\tCountry: "+parents.get(n).getLocations().get(i).getCountry());
				System.out.println("\t\tDistrict: "+parents.get(n).getLocations().get(i).getDistrict());
				System.out.println("\t\tCounty: "+parents.get(n).getLocations().get(i).getCounty());
				System.out.println("\t\tParish: "+parents.get(n).getLocations().get(i).getParish());
				System.out.println("\t\tVillage: "+parents.get(n).getLocations().get(i).getVillage());
				}
		}
		System.out.println("PROGRAM OUTPUT FOR CHILDREN \n....................\n");
		
		for(int n= 0; n<Chld.size(); n++) {
			System.out.println("Child " +(n+1)+"\n....................\n");
			System.out.println("\tName: "+Chld.get(n).getName());
			System.out.println("\tNationality: "+Chld.get(n).getNationality());
			System.out.println("\tYear Of Birth: "+Chld.get(n).getYob());
			
			System.out.println("\t\tLoction Details Of The Child \n\t\t....................");
			
			for (int i=0;i<Chld.get(n).getLocations().size();i++) {
				System.out.println("\t\tCountry: "+Chld.get(n).getLocations().get(i).getCountry());
				System.out.println("\t\tDistrict: "+Chld.get(n).getLocations().get(i).getDistrict());
				System.out.println("\t\tCounty: "+Chld.get(n).getLocations().get(i).getCounty());
				System.out.println("\t\tParish: "+Chld.get(n).getLocations().get(i).getParish());
				System.out.println("\t\tVillage: "+Chld.get(n).getLocations().get(i).getVillage());
				}
		}
	}

}
