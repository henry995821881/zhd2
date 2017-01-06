package org.henry.service.service.impl;

import org.henry.API.service.OrderService;
import org.henry.common.bean.Order;

public class OrderServiceImpl implements OrderService {

	public Order getOrderNo() {

		Order order = new Order();
		order.setDesc("jdsjfkdsjf");
		order.setOrderNo("DD23893498");
		return order;
	}
}
