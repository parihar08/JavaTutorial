package defaultpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;  //Properties Class help java to understand how the properties file is interpreted

public class ReadingProperties {

	public static void main(String[] args) throws IOException{
				
		String path = "//Users//Parihar08//Documents//workspace//JavaTutorial//src//test.properties";
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path); //Reading file in Java
		prop.load(fs); //It will read the complete file inside the memory
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));

	}

}
