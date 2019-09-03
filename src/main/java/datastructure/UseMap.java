package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jahidul Islam
 * Demonstrate how to use Map that includes storing and retrieving elements.
 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
 * Use For Each loop and while loop with Iterator to retrieve data.
 * You can use any other retrieval process
 * Use any databases[ MySql] to store data and retrieve data.
 */
public class UseMap {

	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("joy");
		list.add("Raju");


		List<String> list1 = new ArrayList<String>();
		list1.add("Nayem");
		list1.add("Zahid");
		list1.add("Ahad");

		List<String> list2 = new ArrayList<String>();
		list2.add("java");
		list2.add("Databases");

		map.put("A", list);
		map.put("B", list1);
		map.put("C", list2);
		for (Map.Entry<String, List<String>> str : map.entrySet()) {
			String key = str.getKey();
			List<String> value = str.getValue();
			System.out.println(key);
			System.out.println(value);

		}

	}
}