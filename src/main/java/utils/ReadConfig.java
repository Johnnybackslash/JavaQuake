package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
	
	public static void readConfig(String key) {
		//TODO
		//Dynamically get the properties
		try (InputStream input = new FileInputStream("../config/default.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.out.println(prop.getProperty("db.password"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
}
