package tcs;

import java.util.HashMap;
import java.util.Map;

public class InsensitiveHashMap extends HashMap<String, Integer> {

	@Override
	public Integer put(String key, Integer value) {
		return super.put(key.toLowerCase(), value);
	}

	@Override
	public Integer get(Object key) {
		return super.get(key.toString().toLowerCase());
	}

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new InsensitiveHashMap();
		hashMap.put("Abc", 1);

		System.out.println("ABC Value : "+hashMap.get("abc"));
	}
	
}
