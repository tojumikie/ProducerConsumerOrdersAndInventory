package com.cognixia.jump;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Date purchaseDate;
	private String itemPurchased;
	private Integer itemPurchasedQty;
	public Orders(Integer id, Date purchaseDate, String itemPurchased, Integer itemPurchasedQty) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.itemPurchased = itemPurchased;
		this.itemPurchasedQty = itemPurchasedQty;
	}
	public Orders() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getItemPurchased() {
		return itemPurchased;
	}
	public void setItemPurchased(String itemPurchased) {
		this.itemPurchased = itemPurchased;
	}
	public Integer getItemPurchasedQty() {
		return itemPurchasedQty;
	}
	public void setItemPurchasedQty(Integer itemPurchasedQty) {
		this.itemPurchasedQty = itemPurchasedQty;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", itemPurchased=" + itemPurchased + ", itemPurchasedQty=" + itemPurchasedQty + "]";
	}
}