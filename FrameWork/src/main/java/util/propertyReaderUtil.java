package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertyReaderUtil {
	public static String getproperty(String key) throws IOException
	{
		String filepath=System.getProperty("user.dir")+"\\src\\main\\resources\\variable.properties";
		FileReader fileReader = new FileReader(filepath);
		Properties properties = new Properties();
		properties.load(fileReader);
		return properties.getProperty(key);
		
	}
}
