package lesson10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Vladimir Trandafilov on 25.10.2019.
 */
public class MapProgram {

	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<>();

		map.put("k3", "val3");
		map.put("k2", "val2");
		map.put("k1", "val1");

		for (String val : map.values()) {
			System.out.println(val);
		}

		for (String key : map.keySet()) {
			System.out.println(key);
		}

		for (Map.Entry<String,String> pair : map.entrySet()) {
			System.out.printf("key: '%s' value: '%s' %n", pair.getKey(), pair.getValue());
		}
	}
}
