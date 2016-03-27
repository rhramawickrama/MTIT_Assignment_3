package com.mtit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

import com.mtit.db.DBConn;
import com.mtit.service.*;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);

		// Step 1: Displaying the Menu
		System.out.println("-----Cake Factory Main Menu-----");
		System.out.println();
		System.out.println("1. View all orders");
		System.out.println("2. Add new Order");
		System.out.println("3. Update an Order");
		System.out.println("4. Delete an Order");
		System.out.println();
		System.out.println("Please select your option");
		String option = scanner.next();

		// Step 2: Performing the actions

		// view all orders
		if (option.equals("1")) {
			// TODO
		}

		// Add new order
		else if (option.equals("2")) {

			System.out.println("-----Add new order-----");
			System.out.println();

			System.out.println("Type: ");
			String type = scanner.next();

			System.out.println("Amount: ");
			String amount = scanner.next();

			System.out.println("Date: ");
			String date = scanner.next();

			Service service = (Service) context.getBean("service");
			try {
				service.AddNewOrder(type, amount, date);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// Update an Order
		else if (option.equals("3")) {
			// TODO
		}

		// Delete an Order
		else if (option.equals("4")) {
			// TODO
		}

		// Incorrect option
		else {
			System.out.println("Wrong option");
		}
	}
}