package com.jdbcDemo;

import java.sql.*;

public class JDBC {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Karthi@123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select *from STUDENTSDATA where SID=101");
		while (rs.next()) {
			String name = rs.getString("SNAME");
			int marks = rs.getInt("MARKS");
			int yearOfJoining = rs.getInt("YEAR_OF_JOINING");
			String city = rs.getString("CITY");
			System.out.println(name + " " + marks + " " + yearOfJoining + " " + city);
		}

		st.close();
		con.close();

	}
}