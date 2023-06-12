package com.servletproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConn {
	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/fist","root","charvi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}