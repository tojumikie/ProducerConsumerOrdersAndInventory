package com.cognixia.jump;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/order")
public class OrderController {
	@Autowired
	private OrderRepository orderRepository;
	@PostMapping(path="/add")
	public @ResponseBody String addNewOrder(@RequestParam Date purchaseDate, 
			@RequestParam String itemPurchased, 
			@RequestParam Integer itemPurchasedQty) {
		Orders o = new Orders();
		o.setPurchaseDate(purchaseDate);
		o.setItemPurchased(itemPurchased);
		o.setItemPurchasedQty(itemPurchasedQty);
		return "The order has been added.";
	}
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Orders> getAllOrders() {
		return orderRepository.findAll();
	}
}