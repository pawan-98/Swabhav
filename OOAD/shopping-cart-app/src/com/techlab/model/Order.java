package com.techlab.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private int id;
	private Date date;
	private List<LineItem> items = new ArrayList<LineItem>();

	public Order(int id, String date) throws ParseException {
		this.id = id;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		this.date = (Date) sdf.parse(date);
	}

	public void addItem(LineItem item) {
		boolean flag = false;
		int duplicateLineItemsIndex = 0;
		for (LineItem lineItem : items) {
			if (lineItem.getProduct().getName().equals(item.getProduct().getName())) {
				flag = true;
				duplicateLineItemsIndex = items.indexOf(lineItem);
			}
		}
		if (flag == true) {

			item.setQuantity(item.getQuantity() + items.get(duplicateLineItemsIndex).getQuantity());

		} else {
			items.add(item);
		}
	}

	public double checkoutCost() {
		double totalCost = 0;
		for (LineItem item : items) {
			totalCost = totalCost + item.calculateItemCost();
		}
		return totalCost;
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}
}
