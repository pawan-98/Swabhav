package com.techlab.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import com.techlab.model.Account;
import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingsAccount;

public class AccountTest {
	public static void main(String args[]) throws ParseException, IOException {

		Account younAccHolders[];

		Account acc[] = new Account[5];
		acc[0] = new SavingsAccount(101, "pawan", 7000, "03/19/2011", "04/20/2011");
		acc[1] = new CurrentAccount(102, "amit", 10000, "05/16/2011", "04/11/2011");
		acc[2] = new CurrentAccount(103, "prem", 5000, "05/26/2010", "03/25/2010");
		acc[3] = new CurrentAccount(104, "sonia", 6000, "05/26/2009", "03/25/1968");
		acc[4] = new CurrentAccount(104, "karan", 9000, "05/26/2008", "03/25/1908");
		System.out.println("Account with highest balanace:-" + findRichAccHoolder(acc).getName());

		younAccHolders = findYoungAccholders(acc);
		writeAccountToFile(acc);
		for (int i = 0; i < younAccHolders.length; i++) {
			System.out.println(younAccHolders[i].getName());
		}

	}

	public static void printInfo(Account acc) {
		System.out.println("Account:- " + acc.getAccNo());
		System.out.println("Balance:- " + acc.getBalnce());
		System.out.println("Name:-" + acc.getName());
		System.out.println("Date of creation:- " + acc.getCreationDate());
		System.out.println("Date of birth:-" + acc.getDateOfBirth());

	}

	public static Account findRichAccHoolder(Account[] accountHolders) {
		Account acc = accountHolders[0];
		for (int i = 0; i < accountHolders.length - 1; i++) {
			if (acc.getBalnce() < accountHolders[i].getBalnce()) {
				acc = accountHolders[i];

			}

		}

		return acc;
	}

	public static Account[] findYoungAccholders(Account[] accHolders) {
		int j = 0;
		Date obj = new Date();
		for (int i = 0; i < accHolders.length; i++) {
			if (accHolders[i].getAge() < 40) {
				j++;
			}

		}
		Account[] acc = new Account[j];
		j = 0;
		for (int i = 0; i < accHolders.length; i++) {
			if (accHolders[i].getAge() < 30) {
				acc[j] = accHolders[i];
				j++;
			}

		}

		return acc;
	}

	public static void writeAccountToFile(Account[] accountHolders) throws IOException {
		String fileName = "accholder.csv";
		FileWriter writer = new FileWriter(fileName);
		writer.write("type,accno,name,balance,createdOn,age\n");
		for (Account account : accountHolders) {
			writer.write(account.getType() + "," + account.getAccNo() + "," + account.getName() + ","
					+ account.getBalnce() + "," + account.getCreationDate() + "," + account.getAge() + "\n");
		}
		writer.close();

	}

}
