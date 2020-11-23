package com.lam;

public class Elementclass {

	private String cname;
	private double price;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Elementclass cname=" + cname+",price"+price+"]";
	}
	
	
}
class EmployeeClass
{
	private String ename;
	private int eid;
	private double esalary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmployeeClass[ename="+ename+"eid="+eid+"esalary="+esalary;
	}
	
	}
	
