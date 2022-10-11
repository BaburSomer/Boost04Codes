package com.bilgeadam.course04.lesson20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.bilgeadam.course04.lesson19.Registiration;

public class GenericsExample {

	public static void main(String[] args) {
		beforeJava5();
		afterJava5();
	}

	private static void afterJava5() {
		LinkedList<Integer> integers = new LinkedList<>();
		LinkedList<String>  strings  = new LinkedList<>();
		LinkedList<Registiration> registrations = new LinkedList<>();
		LinkedList<AClass> aClassList = new LinkedList<>();
		LinkedList<Object> anObjectList = new LinkedList<>(); // = LinkedList anObjectList = new LinkedList();
		
		integers.add(1);
		integers.add(100000);
		
		strings.add("merhaba");
		
		for (Integer anInteger : integers) {
			anInteger = anInteger * 3;
		}
		
		HashMap<String, String> map = new HashMap<>();
		map.put("10", "merhaba");
		map.put("2", "dünya");
		map.put("8", "merhaba");
		map.put("4", "dünya");
		System.out.println(map.get(3));
		System.out.println("Hashmap");
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<String, String> entry = (Entry<String, String>) iterator.next();
			System.out.println(entry);
		}
		
		System.out.println("\nTreemap");
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("10", "merhaba");
		treeMap.put("2", "dünya");
		treeMap.put("8", "merhaba");
		treeMap.put("4", "dünya");
		entrySet = treeMap.entrySet();
		for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<String, String> entry = (Entry<String, String>) iterator.next();
			System.out.println(entry);
		}

	}

	private static void beforeJava5() {
		LinkedList linkedList = new LinkedList();
		linkedList.add("merhaba");
		linkedList.add(1);
		linkedList.add(false);
		linkedList.add(new Registiration(1, "aaa", "bbb", 0));
		
		for (Object object : linkedList) {
			System.out.println(object);
			
			if (object instanceof Integer) {
				int a = (int)object;
				a = a + 1;
			}
			else if (object instanceof Registiration) {
				Registiration reg = (Registiration)object;
				System.out.println(reg);
			}
		}
		
	}
}
