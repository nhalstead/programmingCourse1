package com.sjrobotics.velocity.programmingCourse1;

public class Dog {
	
	private String name;
	
	public static String type (){
		return "The Dog that has Class";
	}
	
	public Dog() {
		this.name = "Old No Name";
	}
	
	public Dog( String name ) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void bark() {
		System.out.println("BARK! BARK!");
	}
	
	
}
