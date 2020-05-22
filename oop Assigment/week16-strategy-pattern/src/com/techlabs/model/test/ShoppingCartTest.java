package com.techlabs.model.test;

import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.Item;
import com.techlabs.model.PaytmPayment;
import com.techlabs.model.ShoppingCart;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new PaytmPayment("pawanChhabria@gmail.com", "12345"));
		
		cart.pay(new CreditCardPayment("Pawan Chhabria", "4355464564456", "456"));
	}
}
