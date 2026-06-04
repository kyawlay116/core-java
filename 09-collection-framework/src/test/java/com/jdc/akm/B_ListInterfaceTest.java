package com.jdc.akm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import org.junit.jupiter.api.Test;

public class B_ListInterfaceTest {

	private List<String> list;
	
	@Test
	void testAddAndShow() {
		list = getList("array");
		addData("William","Andrew","John","Andrew");
		
//		add with index
		list.add(1,"Patick");
		showData("ArrayList !");
		System.out.println("Set size : "+list.size());
		
		list = getList("link");
		addData("Andrew", "John", "William", "William");
		showData("LinkedList !");
		
		list.remove(2);
		System.out.println("Set size : "+list.size());
		showData("LinkedList !");
		
	}
	
	void showData(String name) {
		System.out.println("==== Collection FrameWork ====");
		System.out.println("=========== "+ name +" ============");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("=============================");
	}
	
	void addData(String... strings) {
//		Set<String> set = getSet(name);
		for(String n : strings) {
			list.add(n);
		}
	}
	List<String> getList(String name){
		return switch(name) {
		case "array" -> new ArrayList<>();
		case "link" -> new LinkedList<>();
		default -> null;
		};
	}
}
