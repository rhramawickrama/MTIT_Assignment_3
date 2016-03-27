package com.mtit.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Database {

	DBConn dbCon = new DBConn();

	Connection conn = dbCon.getConnection();

	public void addNewOrder(String type, String amount, String date) throws SQLException {

		Statement s = conn.createStatement();

		int count;
		count = s.executeUpdate(
				"INSERT INTO orders (type, amount, date) VALUES ('" + type + "','" + amount + "','" + date + "')");
		s.close();
		System.out.println(count + " rows were inserted");

	}

	public void UpdateOrder() throws SQLException {
		// TODO
	}

	public void DeleteOrder() throws SQLException {
		// TODO
	}

	public void ViewAllOrders() throws SQLException {
		// TODO
	}

	public void ViewSpecificOrder() throws SQLException {
		// TODO
	}

}
