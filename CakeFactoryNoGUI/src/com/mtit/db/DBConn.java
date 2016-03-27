package com.mtit.db;

import java.sql.Connection;
import java.sql.DriverManager;

public final class DBConn {
	private Connection conn;

	public DBConn() {
		conn = null;
		try {
			String userName = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/cakefactory";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			System.out.println("Exception found");
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println("Connection close error");
		}
	}
}