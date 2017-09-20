package com.sjrobotics.velocity.programmingCourse1;

public class Operations {
	private int x;
	private int y;
	private int z;
	private String explainStr = "";
	
	public Operations() {
		this.x = 0;
		this.y = 0;
		this.addExplain("Set X = 0 and Y = 0");
	}
	public Operations(int x, int y) {
		this.x = x;
		this.y = y;
		this.addExplain("Set X = " + x + " and Y = " + y);
	}
	
	public int getLast() {
		return this.z;
	}
	
	// Adds the Stored data in X and Y
	public int add() {
		this.z = this.x + this.y;
		this.addExplain("Added X (" + x + ") with Y (" + y + ")");
		return this.z;
	}
	
	// Does a Temporary Math Operation
	public int addTo(int t) {
		this.z = this.x + this.y;
		this.z += t;
		this.addExplain("Added X (" + x + ") with Y (" + y + ") AND Added T (" + t + ")");
		return z;
	}

	// Subtracts the Stored data in X and Y
	public int sub() {
		this.z = this.x - this.y;
		this.addExplain("Subtracted Y (" + y + ") from X (" + x + ")");
		return this.z;
	}
	
	// Does a Temporary Math Operation
	public int subTo(int t) {
		this.z = this.x - this.y;
		this.z -= t;
		this.addExplain("Subtracted Y (" + y + ") from X (" + x + ") AND Subtracted T (" + t + ")");
		return z;
	}
	
	public void print() {
		System.out.println(this.getLast());
	}
	

	private void addExplain(String in) {
		this.explainStr += "Mathed> " + in + "\n";
	}
	public String explain() {
		return this.explainStr;
	}
}
