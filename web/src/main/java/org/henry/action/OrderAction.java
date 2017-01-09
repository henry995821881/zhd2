package org.henry.action;

import org.henry.API.service.OrderService;
import org.henry.common.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderAction {
	
	@Autowired
	OrderService orderService;
	

	@RequestMapping("/hello")
	public String getSomething(Model model){
		
		Order order = orderService.getOrderNo();
		
		model.addAttribute("order", order);
		System.out.println(order);
		return "order";
	}
	
}
