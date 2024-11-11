package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int id;
	String name;
	boolean is_rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		this.is_rented = true;
	}

	public void returnCat() {
		this.is_rented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return this.is_rented;
	}

	public String toString() {
		return String.format("ID %d. %s", this.id, this.name);
	}

}