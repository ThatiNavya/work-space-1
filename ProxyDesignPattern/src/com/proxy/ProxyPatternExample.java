package com.proxy;

public class ProxyPatternExample {
	public static void main(String[] args) throws Exception {

		DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
		nonAdminExecuter.executeDatabase("DELETE");

		/*
		 * DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin",
		 * "Admin@123"); adminExecuter.executeDatabase("DELETE");
		 */

	}
}
