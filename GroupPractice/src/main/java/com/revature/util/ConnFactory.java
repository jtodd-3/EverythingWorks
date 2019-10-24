package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {

	// Singleton factory
		// private static instance of self
		private static ConnFactory cf = new ConnFactory();

		// private constructor
		private ConnFactory() {
			super();
		}

		// public static synchronized "getter" method
		public static synchronized ConnFactory getInstance() {
			if (cf == null) {
				cf = new ConnFactory();
			}
			return cf;
		}


		// Methods that do stuff
		public Connection getConnection() {
			Connection conn = null;
			String url = "";
			
			String user = "";
			String password = "";
			try {
				conn = DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				System.out.println("Failed to create connection");
				e.printStackTrace();
			}
			return conn;
			
		}

}
