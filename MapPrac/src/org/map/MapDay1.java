package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDay1 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();

		m.put(100, "Java");
		m.put(200, "Selenium");
		m.put(300, "Devops");
		m.put(100, "Testing");
		System.out.println(m);

		String string = m.get(200);
		System.out.println(string);

		// to print only keys

		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);

		// to print only values

		Collection<String> values = m.values();
		System.out.println(values);

		int size = m.size();
		System.out.println(size);

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			System.out.println("the key is" + entry.getKey() + "and the value is" + entry.getValue());
		}

	}
}
