package com.tka.entity;

public class Person {

	int pid;
	String pname;
	int quantity;
	String prodtype;
	int Price;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String pname, int quantity, String prodtype, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.quantity = quantity;
		this.prodtype = prodtype;
		Price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProdtype() {
		return prodtype;
	}
	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", quantity=" + quantity + ", prodtype=" + prodtype
				+ ", Price=" + Price + "]";
	}
	
	
	
}

