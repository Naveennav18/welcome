package org.adact;

import org.test2.BaseClass2;

public class LoginPage extends Adact {

	public static void main(String[] args) {
		BaseClass2 cl = new BaseClass2();
		cl.getDriver("chrome");
		cl.launch("https://adactinhotelapp.com/");

		LoginPage p = new LoginPage();

		p.Adactin("Greens8767", "L4R739");

		Page2 pp = new Page2();
		
		pp.searchPage("Melbourne", "Hotel Creek", "Double", "3", "2", "1", "23/5/23", "25/5/23");
		
		Page3 p1 = new Page3();
		p1.searchhotel();
		
		Page4 p2=new Page4();
	p2.BookHotel("Naveen", "kumar", "chennai", "1234567890987654", "VISA", "2", "2012", "2423");
		
	
		Page5 p3=new Page5();
		p3.orderNo("12345678");
		
		
	
	}

}
