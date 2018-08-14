/**
 * Copyright(C) 2018 Luvina
 *MessageErrorProperties.java, Aug 14, 2018 LA-AM
 */
package manageuser.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author LA-AM
 *
 */
public class MessageErrorProperties {
	static Properties config;
	static HashMap<String, String> proMap = new HashMap<String, String>();
	static InputStream input;
/**
 * đọc file property và lưu DL theo dạng hashmap
 * @param path: đường dẫn đến file properties
 * @return
 * @throws IOException
 */
	public static HashMap<String, String> readMSGErrorProperties(String path) {
		try {
			config = new Properties();
			input = MessageErrorProperties.class.getClassLoader().getResourceAsStream(path);
			if (input == null) {
				System.out.println("unable to find to " + path);
			}
			config.load(input);
			Set<String> propertyName = config.stringPropertyNames();
			for (String property : propertyName) {
				// lấy value và key tương ứng thêm lần lượt vào hashmap
				proMap.put(property, config.getProperty(property));
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// trả về hashmap
					return proMap;
	}
	/**
	 *lấy value từ DB.properties với key cho trước
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public static String getValueOfMEProperty(String value) {
		proMap = readMSGErrorProperties("manageuser/utils/error_msg.properties");
		return proMap.get(value);
	}
	public static void main(String[] args) {
		System.out.println(getValueOfMEProperty("ERR01"));
	}
}
