package org.encap;

public class Encapsulation {
	private String name;
	private   int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		switch (name) {
		case "facabook":
			this.name="10likes";
			
			break;
		case "insta":
			this.name="100followers";
			break;
		

		default:
			System.out.println("no such element");
			break;
		}
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		switch (id) {
		case 100:
			this.id=1;
			
			break;
		case 200:
			this.id=2;
			break;
		case 300:
			this.id=3;
			break;
			

		default:
			System.out.println("Invsalid Number");
			break;
		}
	
	}
	
	
    	 
     
}
