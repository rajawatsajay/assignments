package com.user;
public class Greeter {
	String name;

	public Greeter(String name) {
		this.name = name;
	}
	public String sayHello(){
		System.out.println("Hello,"+name+"!");
		return null;
	}
    public void GoodBye(){
    	System.out.println("Goodbye"+" "+name+"!");
    }
}

