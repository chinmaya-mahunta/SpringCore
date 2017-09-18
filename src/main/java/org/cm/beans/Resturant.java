package org.cm.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Resturant implements ApplicationContextAware{

	private String welcomeNote;
	private Tea tea;
	private Cofee cofee;
	ApplicationContext context =null;
	
	public Cofee getCofee() {
		return cofee;
	}
	public void setCofee(Cofee cofee) {
		this.cofee = cofee;
	}
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
		getCofee().prepairCofee();
		getCofee().prepairCofee();
		
		Cofee cf = (Cofee) context.getBean("cofee");
		cf.prepairCofee();
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context = applicationContext;
	}
}
