package com.jdc.akm;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class F_MapInterfaceTest {

	private Map<Integer, String> map;
	
	@Test
	void test() {
//		map = new HashMap<Integer, String>();
		map = new LinkedHashMap<Integer, String>();
		add();
//		show("Hash Map");
		show("Tree Map");
	}
	
	private void show(String name) {
		System.out.println("======= "+name+" =========\n");
		for(Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Key : %d   Value : %s \n"
					.formatted(e.getKey(), e.getValue()));
		}
		System.out.println("=========  End  ==========");
	}
	
//	Key can't duplicate
//	TreeMap order by key
	private void add() {
		map.put(3, "CC");
		map.put(5, "EE");
		map.put(2, "BB");
		map.put(1, "GG");
		map.put(4, "DD");
		map.put(3, "CC");
	}
}
