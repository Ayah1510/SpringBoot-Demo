package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//to specify that this is a class I will make objects of (Make it a bean)
@Component
//@Scope(value="prototype")
public class Alien {
	private int aid;
	private String aname;
	private String tech;
	@Autowired //searches by type (must be written/ to prevent null pointer exception)
	//@Qualifier("lap1") //searches by name
	private Laptop laptop;
	
	
	public Alien() {
		super();
		System.out.println("New object is made");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	public void show() {
		System.out.println("Using show method");
		laptop.compile();
	}
	
}
