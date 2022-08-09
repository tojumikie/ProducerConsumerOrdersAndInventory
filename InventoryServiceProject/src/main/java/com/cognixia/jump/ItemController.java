package com.cognixia.jump;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		itemRepository.save(i);
		return "new item information saved";
	}
//	@PostMapping(path="/add")
//	public ResponseEntity<Item> addNewItem(@Valid @RequestBody Item item) {
//		Item added = itemRepository.addItem(item);
//		System.out.println("new item created: " + added);
//		return ResponseEntity.ok(added + " created.");
//	}
//	@RequestMapping(method=RequestMethod.POST, value="/add")
//	public Item addNewItem(@RequestBody Item item) {
//		return itemRepository.save(item);
//	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Item> getAllItems() {
		return itemRepository.findAll();
	}
}
