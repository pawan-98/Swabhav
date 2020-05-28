package facade.pattern.model.test;

import facade.pattern.model.MobileStore;

public class MobilStoreTest {
	public static void main(String args[]) {
		MobileStore mobileStore= new MobileStore();
		System.out.println("Client want to see Real Me mobile");
		mobileStore.realMeSale();
	}
	
}
