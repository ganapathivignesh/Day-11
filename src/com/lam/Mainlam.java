package com.lam;

public class Mainlam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Twostring p=((str1,str2)->str1.length()>str2.length()?str1:str2);
		String longer=p.betterstring("application", "knowledge");
		System.out.println(longer+"is longer");
		Twostring.display();
		System.out.println(p.betterstring("pirates", "data")+" "+"is longer");
		
		
		Elementclass ec=new Elementclass();
		ec.setCname("audi");
		ec.setPrice(5000000);
		Elementclass ec1=new Elementclass();
		ec1.setCname("renault");
		ec1.setPrice(1200000);
		Twoelement c=((c1,c2)->((Elementclass)c1).getPrice()>((Elementclass)c2).getPrice()?c1:c2);
		System.out.println(c.betterelement(ec, ec1));
		
		
		EmployeeClass e1=new EmployeeClass();
		e1.setEid(874);
		e1.setEname("chandran");
		e1.setEsalary(25000);
		EmployeeClass e2=new EmployeeClass();
		e2.setEid(125);
		e2.setEname("vivek");
		e2.setEsalary(85000);
		
		Twoelement c=((c1,c2)->((Employeeclass)c1).getesalary()>((Employeeclass)c2).getesalary()?c1:c2);
		System.out.println(c.betterelement(e1, e2));
		
		
		
	}

}
