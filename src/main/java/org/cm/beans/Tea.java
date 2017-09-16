package org.cm.beans;

public class Tea {

	private boolean milk;
	private boolean cold;
	
	public Tea() {
		// TODO Auto-generated constructor stub
		System.out.println("Tea object created..");
	}
	public boolean isMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		System.out.println("Set milk");
		this.milk = milk;
	}
	public boolean isCold() {
		System.out.println("Set cold");
		return cold;
	}
	public void setCold(boolean cold) {
		this.cold = cold;
	}
	
	public void prePairTea() {
		String msg = "Prepairing ";
		if(cold)
			msg = msg.concat(" cold ");
		else
			msg = msg.concat(" hot ");
		if(milk)
			msg = msg.concat("milk tea...");
		else
			msg = msg.concat("black tea...");
		System.out.println(msg);
	}
	
}
