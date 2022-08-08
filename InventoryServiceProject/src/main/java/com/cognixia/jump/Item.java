package com.cognixia.jump;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Hibernate will make a table out of this class
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private Double price;
	private Integer quantityAvailable;
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", quantityAvailable=" + quantityAvailable
				+ "]";
	}
	public Item(Integer id, String name, Double price, Integer quantityAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
	}
	public Item() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(Integer quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
}