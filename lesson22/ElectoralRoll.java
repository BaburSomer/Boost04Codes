package com.bilgeadam.course04.lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ElectoralRoll {
	
	public static void main(String[] args) {
		Map<Long, Person> rollById = new HashMap<>();
		Map<String, Person> rollByName = new HashMap<>();
		List<Person>      list = new ArrayList<>();
		
		Person p = new Person("Hilal", 2020, 123_123_123_23L, "Ankara");
		rollById.put(p.getIdNo(), p);
		rollByName.put(p.getName(), p);
		list.add(p);
		
		if (list.contains(p)) {
			System.out.println(p.getName() + " listede bulunmakta");
		}
		
		p=new Person("Alperen", 1998, 123_123_143_23L, "Ankara");
		rollById.put(p.getIdNo(), p);
		rollByName.put(p.getName(), p);
		list.add(p);
		
		p=new Person("Ezgi", 1950, 993_123_143_23L, "Kocaeli");
		rollById.put(p.getIdNo(), p);
		rollByName.put(p.getName(), p);
		list.add(p);
		
		Collections.sort(list);
		Collections.reverse(list);
		for (Person person : list) {
			System.out.println(person);
			try {
				person.giveAVote("Seçimim....");
			} catch (CannotVoteException e) {
				System.err.println(person.getName() + " oy kullanamaz");
				
			}
		}
		System.out.println("\n************");
		Set<Entry<String, Person>> entries =  rollByName.entrySet();
		for (Entry<String, Person> entry : entries) {
			System.out.println(entry.getValue());
		}
		System.out.println("\n************");
		
		Person searchedPerson = rollByName.get("Hilal");
		System.out.println("Search person: " + searchedPerson);
		if (list.contains(searchedPerson)) {
			System.out.println(searchedPerson.getName() + " listede bulunmakta");
			list.remove(searchedPerson);
		}

		if (rollById.containsKey(searchedPerson.getIdNo())) {
			System.out.println(searchedPerson.getName() + " listede bulunmakta");
		}
	}
}
