package com.cognixia.jump;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/item")
public class ItemController {
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewItem(@RequestParam String name, 
			@RequestParam Double price, @RequestParam Integer quantityAvailable) {
		Item i = new Item();
		i.setName(name);
		i.setPrice(price);
		i.setQuantityAvailable(quantityAvailable);
		return "new item information saved";
	}
	
//	@GetMapping(path="/all")
//	public @ResponseBody Iterable<Item> getAllItems() {
//		return ItemRepository.findAll();
//	}
}
