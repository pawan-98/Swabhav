package com.techlab.model.test;

import com.techlab.model.Boy;
import com.techlab.model.IEmotions;
import com.techlab.model.IMannerable;
import com.techlab.model.Man;

public class Test {
	public void main(String args[]) {
		Man man = new Man();
		Boy boy = new Boy();
		//atTheCinemaHall(man);
		atTheCinemaHall(boy);
		atThePartyHall(man);
		atThePartyHall(boy);
		
	}
	void atTheCinemaHall(IEmotions obj) {
		System.out.println("At the cinema hall");
		obj.cry();
		obj.laugh();
	}
	void atThePartyHall(IMannerable obj) {
		System.out.println("At the Party hall");
		obj.depart();
		obj.wish();
	}

}
