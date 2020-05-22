package com.techlab.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.techlab.model.Customer;
import com.techlab.model.LineItem;
import com.techlab.model.Order;
import com.techlab.model.Product;

public class Test {
	public static void main(String[] args) throws ParseException, IOException {
		Customer kishore = new Customer(101, "kishore", "Chembur");
		Customer vishal = new Customer(102, "vishal", "Andheri");

		Product chair = new Product(1, "chair", 90, 60);
		Product pencil = new Product(2, "pencil", 15, 55);
		Product eraser = new Product(3, "eraser", 36, 35);
		Product table = new Product(11, "table", 455, 46);
		Product watch = new Product(12, "watch", 6550, 7);
		LineItem chairItem = new LineItem(201, 12, chair);
		LineItem pencilItem = new LineItem(202, 10, pencil);
		LineItem eraserItem = new LineItem(203, 5, eraser);
		LineItem tableItem = new LineItem(301, 2, table);
		LineItem watchItem = new LineItem(302, 1, watch);

		Order order1 = new Order(1, "1/02/2020");
		order1.addItem(chairItem);
		order1.addItem(chairItem);
		order1.addItem(pencilItem);
		order1.addItem(eraserItem);

		Order order2 = new Order(2, "17/04/2020");
		order2.addItem(tableItem);
		order2.addItem(watchItem);

		kishore.addOrder(order1);
		kishore.addOrder(order2);

		printInfo(kishore);
		makeCsv(kishore);

	}

	private static void printInfo(Customer customer) {
		double totalCost = 0;
		System.out.println("Customer details : ");
		System.out.println("Customer ID : " + customer.getId() + "\nCustomer name : " + customer.getName()
				+ "\nCustomer Address : " + customer.getAddress());
		System.out.println("\nOrder details : ");
		List<Order> orders = customer.getOrders();
		for (Order order : orders) {
			System.out.println("Order id : " + order.getId());
			System.out.println("Order date : " + order.getDate());
			System.out.println("Line item details : ");
			List<LineItem> items = order.getItems();
			for (LineItem item : items) {
				System.out.println("Line item id : " + item.getId() + "\nLineItem product : "
						+ item.getProduct().getName() + "\nProduct quantity : " + item.getQuantity()
						+ "\nLine item cost : " + item.calculateItemCost());
				System.out.println("Order total : " + order.checkoutCost());
			}
			totalCost = totalCost + order.checkoutCost();
			System.out.println("\n");
		}
		System.out.println("Cart total is : " + totalCost);

	}

	public static void makeCsv(Customer customer) throws IOException {
		FileWriter fileWriter = new FileWriter("ShoppingDetails.csv");
		double totalCost = 0;
		fileWriter.write("Customer ID : " + customer.getId() + "\nCustomer name : " + customer.getName()
				+ "\nCustomer Address : " + customer.getAddress());
		fileWriter.write("\nOrder details : ");
		List<Order> orders = customer.getOrders();
		for (Order order : orders) {
			fileWriter.write("\nOrder id : " + order.getId()+"\nOrder date : " + order.getDate());
			List<LineItem> items = order.getItems();
			fileWriter.write("\nLine item id : " + ",LineItem product : "
					+",Product quantity : "+ ",Line item cost"+"\n");
			for (LineItem item : items) {
				fileWriter.write( item.getId() + ","+ item.getProduct().getName() + ", " + item.getQuantity()
						+ ", " + item.calculateItemCost()+"\n");
			}
			totalCost = totalCost + order.checkoutCost();
		}
		fileWriter.write("Cart total is : " + totalCost);

		fileWriter.close();
	}

}
