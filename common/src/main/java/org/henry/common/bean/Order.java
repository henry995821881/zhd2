package org.henry.common.bean;

import java.io.Serializable;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderNo;
	private String desc;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", desc=" + desc + "]";
	}
	
	

}
