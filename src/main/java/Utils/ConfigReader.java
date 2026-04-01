package Utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	 private Properties properties;

	    public ConfigReader() {
	        try {
	            properties = new Properties();
	            InputStream input = getClass()
	                    .getClassLoader()
	                    .getResourceAsStream("config.properties");

	            properties.load(input);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public String get(String key) {
	        return properties.getProperty(key);
	    }
	}

