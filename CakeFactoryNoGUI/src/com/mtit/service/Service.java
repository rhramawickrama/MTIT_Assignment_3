package com.mtit.service;

import com.mtit.db.*;

public class Service {

	public void AddNewOrder(String type, String amount, String date) throws Exception {

		Database database = new Database();
		database.addNewOrder(type, amount, date);

	}

}