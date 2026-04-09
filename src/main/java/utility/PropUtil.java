package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
public String getProperty(String filePath,String key) throws IOException {
	FileInputStream file=new FileInputStream(filePath);
	String value=null;
	
	Properties prop= new Properties();
	prop.load(file);
	
	value=prop.getProperty(key);
	return value;
	
	
}
public static void main(String[] args) throws IOException {
	String value=new PropUtil().getProperty("./src/main/resources/Locator.properties", "Profile");
	System.out.println("Value"+value);
}
}
