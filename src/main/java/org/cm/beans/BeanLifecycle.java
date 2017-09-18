package org.cm.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycle implements InitializingBean,DisposableBean{

	private String note;
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void execute() {
		System.out.println("BeanLifecycle.execute().....");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BeanLifecycle.afterPropertiesSet()");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BeanLifecycle.destroy()");
		
	}
	
	public void customInit() {
		System.out.println("BeanLifecycle.customInit()");
	}
	
	public void customDestroy() {
		System.out.println("BeanLifecycle.customDestroy()");
	}
}
