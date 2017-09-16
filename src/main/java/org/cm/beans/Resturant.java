package org.cm.beans;

public class Resturant {

	private String welcomeNote;
	private Tea tea;
	
	public Resturant() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	public Tea getTea() {
		return tea;
	}
	public void setTea(Tea tea) {
		this.tea = tea;
	}
	public Resturant(String initialText) {
		// TODO Auto-generated constructor stub
		welcomeNote = initialText;
		System.out.println(welcomeNote);
	}
	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	
	public void takeOrder() {
		System.out.println(welcomeNote);
		System.out.println("Taking order...");
		getTea().prePairTea();
		System.out.println("Tea has been served.");
		System.out.println("-----Have a nice drink------.");
	}
}
