package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ReadFromPropertiesFile {
	public static void main(String[] args) throws Exception {
		File file = new File("demo.properties");
		// FileInputStream or FileReader - anyone can be used

		// Reading Properties File:
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
		String uname = p.getProperty("db.username");
		String pwd = p.getProperty("db.password");
		System.out.println("uname = " + uname + ", pwd = " + pwd);

		// Writing Data into Properties File
		FileOutputStream fos = new FileOutputStream(file);
		p.setProperty("thisiskey", "this is value");
		p.store(fos, "Sample writing123");
		System.out.println("Data stored in Properties file");

	}
}
