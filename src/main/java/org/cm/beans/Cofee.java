package org.cm.beans;

public class Cofee {

	int orderNo;

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public void prepairCofee() {
		orderNo ++;
		System.out.println("OrderNo: "+orderNo);
	}
}
