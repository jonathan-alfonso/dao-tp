package tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	
	private static Config INSTANCE = new Config();
	private Properties properties = null;
	
	private Config() {
		properties = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config-dao.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Config getInstance() {
		return INSTANCE;
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
